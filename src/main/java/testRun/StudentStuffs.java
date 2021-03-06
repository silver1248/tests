package testRun;
 
public class StudentStuffs {
    
    /**
     * Student Class
     * each student has
     * -GPA   -name
     * -# of credits completed
     *
     * All students share
     * #of credits needed to graduate
     * =256
     *
     * Want program where create bunch of students
     * and print out whether they can graduate or not
     * 
     * Instructions for program:
     * look at first few lines of ContinuousCounter
     * and do that to make new students
     */
    public static void main(String[] args) {
        
        StudentStuffs fred = new StudentStuffs(3.7, "Fred", 160);
        StudentStuffs bob = new StudentStuffs(2.6, "Bob", 305);
        StudentStuffs jane = new StudentStuffs(4.0, "Jane", 300);
        StudentStuffs sarah = new StudentStuffs(3.7, "Sarah", 110);
//        Fred.printCanGraduate();
//        Jane.printCanGraduate();
//        Sarah.printCanGraduate();
//        Bob.printCanGraduate();
        
        
        System.out.println(fred);
        System.out.println(bob);
        System.out.println(jane);
        System.out.println(sarah);
    }
   
    public String toString() {
        return name + " has a gpa of " + gpa + ", has " + credits + " credits, and " + canGraduateText() + ".";
    }
    public StudentStuffs(double gpa, String name, int credits) {
        this.gpa = gpa;
        this.name = name;
        this.credits = credits;
    }
    double gpa;
    String name;
    int credits;
    static int creditsNeeded = 256;
    
    public boolean canGraduate() {
        return credits > creditsNeeded;
    }
    
    public String canGraduateText() {
        return canGraduate() ? "can graduate" : "can't graduate";
    }
//    public void printCanGraduate() {
//        if (canGraduate()) {
//            System.out.println(name + " can graduate");
//        } else {
//            System.out.println(name + " can't graduate");
//        }
//    }
}    
