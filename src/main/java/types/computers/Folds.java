package types.computers;

import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.collection.List;

public class Folds {


    public static void main(String[] args) {
        List<Computer> computers = ComputerFinder.getDefaultList();

//        System.out.println(totalRam(computers));
//        System.out.println(totalHD(computers));
//        System.out.println(totalRamOfPcs(computers));
//        System.out.println(productOfRam(computers));
//        System.out.println(productOfRamOfCompsWithMoreThan7Char(computers));
//        System.out.println(productOfRamOfManLengthRamSize(computers, 10, 32));
//        System.out.println(productOfRamSquaredManLengthRamSize(computers, 10, 1024));
//        System.out.println(productOfRamFManLengthRamSize(computers, l -> l*l, 10, 1024));
//        System.out.println(fred(computers, c -> c.getRamSize(), l -> l > 63 ));
//        System.out.println(fred2(computers, c -> c.getRamSize(), l -> l > 63 ));
        
        List<Tuple2<Tuple2<Computer, String>, Integer>> foo = test(computers, c -> c.getName(), s -> s.length());
        System.out.println(test(computers, c -> c.getName(), s -> s.length()));
        System.out.println(foo.get()._1()._2());
    }



    /**
     * prints total ram of all computers
     * @return total ram
     */
    public static Long totalRam(List<Computer> computers) {
        return computers
                .map(Computer::getRamSize)
                .fold(0l, Long::sum);
    }

    /**
     * prints total HD of all computers
     * @return total HD
     */
    public static Long totalHD(List<Computer> computers) {
        return computers
                .map(Computer::getHardDriveSize)
                .fold(0l, Long::sum);
    }


    /**
     * prints total ram of PCs
     * 
     * @param computers the list of computers to filter out macs and return total ram
     * @return total ram of PCs
     */
    public static Long totalRamOfPcs(List<Computer> computers) {
        return computers
                .filter(c -> !c.getManufacturer().equals("Apple"))
                .map(Computer::getRamSize)
                .fold(0l, Long::sum);
    }
    
    /**
     * gives product of all ram
     * @param computers list of computers
     * @return product of ram
     */
    public static Long productOfRam(List<Computer> computers) {
        return computers
                .map(Computer::getRamSize)
                .fold(1l, (l1, l2) -> l1 * l2);
    }
    
    public static Long productOfRamOfCompsWithMoreThan7Char(List<Computer> computers) {
        int minLength = 7;
        
        return computers
                .filter(c -> c.getManufacturer().length() > minLength)
                .map(Computer::getRamSize)
                .fold(1l, (l1, l2) -> l1 * l2);
    }
    
    public static Long productOfRamOfManLengthRamSize(List<Computer> computers, long minLength, long minRam) {
        return computers
                .filter(c -> c.getManufacturer().length() > minLength)
                .filter(c -> c.getRamSize() > minRam)
                .map(Computer::getRamSize)
                .fold(1l, (l1, l2) -> l1 * l2);

        //these two do the same thing as the one above
//        return computers
//                .filter(c -> c.getManufacturer().length() > minLength)
//                .map(Computer::getRamSize)
//                .filter(l -> l > minRam)
//                .fold(1l, (l1, l2) -> l1 * l2);
//        
//        return computers
//                .filter(c -> c.getManufacturer().length() > minLength 
//                        && c.getRamSize() > minRam)
//                .map(Computer::getRamSize)
//                .fold(1l, (l1, l2) -> l1 * l2);
    }

    public static Long productOfRamSquaredManLengthRamSize(List<Computer> computers, long minLength, long minRam) {
        return computers
                .filter(c -> c.getManufacturer().length() > minLength)
                .map(c -> c.getRamSize() * c.getRamSize())
                .filter(l -> l > minRam)
                .fold(1l, (l1, l2) -> l1 * l2);
    }

    public static Long productOfRamFManLengthRamSize(
            List<Computer> computers
            , Function1<Long, Long> f
            , long minLength
            , long minRam)
    {
        return computers
                .filter(c -> c.getManufacturer().length() > minLength)
                .map(c -> f.apply(c.getRamSize()))
                .filter(l -> l > minRam)
                .fold(1l, (l1, l2) -> l1 * l2);
    }
    /**
     * f1: Computer -> Long
     * f2: Long -> Boolean
     * Boolean operator is > or <
     * C such that f2(f1(c))
     * @param computers
     * @param f1
     * @param f2
     * @return
     */
    public static List<Computer> fred(List<Computer> computers, Function1<Computer, Long> f1, Function1<Long, Boolean> f2) {
        return computers
                .filter(c -> f2.apply(f1.apply(c)));
    }
    
//    public static List<Long> fred2(List<Computer> computers, Function1<Computer, Long> f1, Function1<Long, Boolean> f2) {
//        return computers
//                .map(c -> Tuple.of(c, ))
//                .map(c -> f1.apply(c))
//                .filter(c -> f2.apply(c));
//    }
    
    public static List<Tuple2<Computer, Integer>> tuplePractice(List<Computer> computers) {
        return computers
                .map(c -> Tuple.of(c, c.getManufacturer().length()));
    }
    
    public static List<Tuple2<Computer, Integer>> tuplePractice(List<Computer> computers, Function1<Computer, Integer> f) {
        return computers.
                map(c -> Tuple.of(c, f.apply(c)));
    }

    public static List<Tuple2<Computer, String>> test2(List<Computer> computers, Function1<Computer, String> f ) {
        return computers
                .map(c -> Tuple.of(c, f.apply(c)));
    }
    
    public static List<Tuple2<Tuple2<Computer, String>, Integer>> test(List <Computer> computers
            , Function1<Computer, String> f1
            , Function1<String, Integer> f2) 
    {
        return computers
                .map(c -> Tuple.of(c, f1.apply(c)))
                .map(t -> Tuple.of(t, f2.apply(t._2())));
    }
    
    public static List<Tuple3<Computer, String, Integer>> test2(List <Computer> computers
            , Function1<Computer, String> f1
            , Function1<String, Integer> f2) 
    {
        
        return computers
                .map(c -> Tuple.of(c, f1.apply(c)))
                .map(t -> Tuple.of(t._1(), t._2(), f2.apply(t._2())));
    }
    
    /**
     * takes a List<Computer>, f1: Computer -> Long(getRamSize), f2: Long -> Boolean(l -> l > 35), 
     * and f3: Long -> Long.  It will apply the f1, use f2 as a filter,
     * then apply f3( * 2) to what's left, and return those Longs.
     */
    
    /*
     * Write methods that
     * 1) gets the total ram
     * 2) gets the total hd
     * 3) gets the total ram of every non-mac
     * 4) gets the product of the ram
     * 5) gets the product of the ram of machines where the manufacturer has more than 7 characters
     * 6) gets the product of rams greater than 32 when the manufacturer has more than 
     *    n characters (use 7)
     * 7) 2 methods with 2 functions that do the same thing
     */
}