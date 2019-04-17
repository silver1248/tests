package types.computers;

import io.vavr.collection.List;
import lombok.Value;

@Value
public class ComputerFinder  {

    List<Computer> computers;

    public static void main(String[] args) {
        List<Computer> input = List.of(
                new PC("Corsair", "One i160", 32, 2048),
                new PC("Alienware", "Aroura R7", 64, 1024), 
                new Mac("Mac Pro", 64, 2048));

        ComputerFinder cf = new ComputerFinder(input);

        for (Computer computer : cf.match2(64,2048)) {
            System.out.println(computer);
        }
        System.out.println(cf.getRam());
        System.out.println(cf.getHD());
        System.out.println(cf.getHDAndRam());
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

    public List<Long> getRam() {
        return computers.map(c -> c.getRamSize());
    }

    public List<Long> getHD() {
        return computers.map(c -> c.getHardDriveSize());
    }

    public List<Long> getHDAndRam() {
        return computers
                .filter(c -> c.getRamSize() > 32)
                .map(c -> c.getHardDriveSize() + c.getRamSize());
    }

    public List<Computer> match2(long minRam, long minHD) {
        return computers
                //                .filter(c -> c.getRamSize() >= minRam && c.getHardDriveSize() >= minHD)
                .filter(c -> c.getManufacturer().toUpperCase().startsWith("A"))
                .map(c -> new Mac(c.getName(), c.getRamSize() * 2, c.getHardDriveSize() * 2));
    }
}