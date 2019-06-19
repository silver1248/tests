package testRun;

import io.vavr.collection.List;

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
     */
    public static void main(String[] args) {
//        StudentStuffs numOfCreditsCompleted = new StudentStuffs(256);
    
        List.of(
                "Fred",
                "Bob",
                "Susan",
                "Ellen"
                );
    
    }
    
    public StudentStuffs(int numOfCreditsCompleted) {
        
    }
    
    
}
