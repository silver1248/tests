package types.computers;

import io.vavr.collection.List;

public class ComputerFinder {

    public static void main(String[] args) {
        //        Computer bob = new Mac("bob", "8 GB", "1 TB");
        Computer orsair = new PC("Corsair One i160", "32 GB", "2 TB");
        Computer lienware = new PC("Alienware Aroura R7", "64 GB", "2 TB");

        List <Computer> computers = List.of(
               new PC("Corsair One i160", "35 GB", "2 TB"),
               new PC("Alienware Aroura R7", "64 GB", "2 TB"));

                //        System.out.println(bob);
    }

    /**
     * Accepts the minimum amount of ram needed, and the minimum amount of hd needed, and a 
     * list of computers.
     * @param minRam
     * @param minHD
     * @param computers
     * @return the sublist of computers that satisfy the criteria
     */
    private static List<Computer> matchComputers(long minRam, long minHD, List<Computer> computers) {
        return computers;
    }
}