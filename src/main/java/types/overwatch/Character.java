package types.overwatch;

import java.time.LocalDate;
import java.time.Period;

import io.vavr.collection.List;
import types.person.Sex;
/*
 * the birthdays for these characters are completely made up
 */

public class Character{
    private final String name;
    private final Sex sex;
    private final Role role;
    private final LocalDate birthday;

    public Character(String name, Sex sex, Role role, LocalDate birthday) {
        this.name = name;
        this.sex = sex;
        this.role = role;
        this.birthday = birthday;
    }
    
    public int getAge() {
        Period p = Period.between(birthday, LocalDate.of(2075, 12, 1));
        return p.getYears();
    }

    @Override
    public String toString() {
        return String.format("%s is a %s character. %s was born in %s so %s is %s years old"
                , name, role, sex.getPronoun(), birthday, sex.getPronoun(), getAge());
    }

    public static void main(String[] args) {
        List<Character> people = List.of(
                new Character("Jean-Baptiste Augustin", Sex.MALE, Role.SUPPORT
                        , LocalDate.of (2039, 2, 23)), 
                new Character("Elizabeth Caledonia “Calamity” Ashe", Sex.FEMALE, Role.DAMAGE
                        , LocalDate.of(2036, 7, 15))
                );
        for (Character person : people) {
            System.out.println(person);
        }
    }
}
