package types.overwatch;

//import java.time.LocalDate;
//import java.time.Period;

import io.vavr.collection.List;
//import types.person.Person;
import types.person.Sex;

public class Character{
    private final String name;
    private final Sex sex;

    public Character(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

//    public int getAge() {
//        return p.getYears();
//    }

    @Override
    public String toString() {
        return String.format("%s is named %s.", sex.getPronoun(), name);
    }

    public static void main(String[] args) {
        List<Character> people = List.of(
                new Character("Jean-Baptiste Augustin", Sex.MALE), 
                new Character("Elizabeth Caledonia “Calamity” Ashe", Sex.FEMALE)
                );
        for (Character person : people) {
            System.out.println(person);
        }
    }
}
