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
        
        StudentStuffs Fred = new StudentStuffs(3.7, "Fred", 160);
        StudentStuffs Bob = new StudentStuffs(2.6, "Bob", 305);
        StudentStuffs Jane = new StudentStuffs(4.0, "Jane", 300);
        StudentStuffs Sarah = new StudentStuffs(3.7, "Sarah", 110);
        graduationPossibility();
    }
    public StudentStuffs(double gpa, String name, int credits) {
        this.gpa = gpa;
        this.name = name;
        this.credits = credits;
    }
    static double gpa;
    static String name;
    static int credits;
    static int creditsNeeded;
    
    public static boolean graduationPossibility() {
        if(credits > 256) {
            System.out.println(name + " can graduate");
            return true;
        } else{
            System.out.println(name + " can't graduate");
            return false;
        }
    }
}    
