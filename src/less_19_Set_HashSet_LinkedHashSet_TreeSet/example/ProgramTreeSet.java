package less_19_Set_HashSet_LinkedHashSet_TreeSet.example;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TheSusanin
 * 28 апрель 2021
 */
public class ProgramTreeSet {
    public static void main(String[] args) {
        Comparator<Person> pcomp = new PersonComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet<>(pcomp);
        people.add(new Person("Tom", 34));
        people.add(new Person("Nick", 42));
        people.add(new Person("ALice", 32));
        people.add(new Person("Bill", 25));
        people.add(new Person("Amazon", 29));
        for (Person person : people)
            System.out.println(person.getName() + " " + person.getAge());
    }
}
