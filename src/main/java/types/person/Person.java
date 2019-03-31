package types.person;

import java.time.LocalDate;
import java.time.Period;

import io.vavr.collection.List;

public class Person {
    private final String name;
    private final LocalDate birthday;
    private final Sex sex;
    
    public Person(String name, LocalDate birthday, Sex sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    
    public int getAge() {
        Period p = Period.between(birthday, LocalDate.now());
        return p.getYears();
    }
    
    @Override
    public String toString() {
        return String.format("%s was born on %s so %s is %s years old.", name, birthday, sex.getPronoun(), getAge());
    }
    
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Dorian", LocalDate.of(2007, 3, 20), Sex.MALE), 
                new Person("Vivian", LocalDate.of(2009, 9, 18), Sex.FEMALE), 
                new Person("Hattie", LocalDate.of(2007, 5, 12), Sex.OTHER)
                );
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
