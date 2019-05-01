package types.computers;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.control.Option;
import lombok.Value;

@Value
public class ComputerFinder  {

    List<Computer> computers;

    public static void main(String[] args) {
        Mac mac = new Mac("Mac Pro", 64, 2048);

        List<Computer> input = List.of(
                new PC("AlienwareLonger", "Aroura R7", 64, 1024), 
                new PC("Corsair", "One i160", 32, 2048),
                new PC("Alienware", "Aroura R7", 64, 1024), 
                new Mac("Mac Pro", 64, 2048));

        ComputerFinder cf = new ComputerFinder(input);

        for (Computer computer : cf.match2(64,2048)) {
            System.out.println(computer);
        }
        //        System.out.println(cf.getRam());
        //        System.out.println(cf.getHD());
        //        System.out.println(cf.getHDAndRam());

        System.out.println(cf.computers.distinct().map(c -> c.getHardDriveSize()).fold(0l, (l,m) -> l+m));
        System.out.println(cf.computers.map(c -> c.getHardDriveSize()).distinct().fold(0l, (l,m) -> l+m));
        System.out.println(cf.computers.contains(mac));
        System.out.println(cf.biggestAddition());
        System.out.println(cf.getNameAndMan());
        System.out.println(cf.longestNameAndMan());
        System.out.println(cf.shortestNameAndMan());
    }


    /**
     * Accepts the minimum amount of ram needed, and the minimum amount of hd needed, and a 
     * list of computers.
     * @param minRam
     * @param minHD
     * @param computers
     * @return the sublist of computers that satisfy the criteria
     */
    public List<Computer> match(long minRam, long minHD) {
        List <Computer> matching = List.empty();
        for (Computer computer : computers) {
            if (minRam <= computer.getRamSize() && minHD <= computer.getHardDriveSize()) {
                matching = matching.prepend(computer);
            }
        }
        return matching.reverse();
    }

    //    public List<Long> getRam() {
    //        return computers.map(c -> c.getRamSize());
    //    }
    //
    //    public List<Long> getHD() {
    //        return computers.map(c -> c.getHardDriveSize());
    //    }
    //
    //    public List<Long> getHDAndRam() {
    //        return computers
    //                .filter(c -> c.getRamSize() > 32)
    //                .map(c -> c.getHardDriveSize() + c.getRamSize());
    //    }
    //    

    public long biggestAddition() {        
        return computers
                .map(c -> c.getHardDriveSize() + c.getRamSize())
                .max()
                .get();
    }

    public List<String> getNameAndMan() {
        return computers
                .map(c -> c.getManufacturer() + " " + c.getName());
    }
    
    public String longestNameAndMan() {
        return getNameAndMan()
                .map(s -> Tuple.of(s, s.length()))
                .maxBy(t -> t._2())
                .get()
                ._1();
    }
    
    public String shortestNameAndMan() {
        return getNameAndMan()
                .map(s -> Tuple.of(s, s.length()))
                .minBy(t -> t._2())
                .get()
                ._1();
    }
    
    /*
     * 1. The name and manufacturer together with a space between them(All computers)
     * 2. Longest printout of #1
     * 3. Shortest of #1
     * 4. all longer than Random number (between 10 and 20)
     * 5. The name and manufacturer together with a space between them when
     * manufacturer is more than 6 characters (or something)
     * 6. ram and manufacturer when the ram size times 2 if bigger than 64
     */

    public Computer longestName() {
        return computers
                .map(c -> Tuple.of(c, c.toString().length()))
                .maxBy(t -> t._2())
                .get()
                ._1();
    }

    public int longestInput() {
        return computers
                .map(c -> c.toString().length())
                .max()
                .get();
    }

    public List<Computer> match2(long minRam, long minHD) {
        return computers
                .filter(c -> c.getRamSize() >= minRam && c.getHardDriveSize() >= minHD)
                .filter(c -> c.getManufacturer().toUpperCase().startsWith("A"))
                .map(c -> new Mac(c.getName(), c.getRamSize() * 2, c.getHardDriveSize() * 2));
    }
}