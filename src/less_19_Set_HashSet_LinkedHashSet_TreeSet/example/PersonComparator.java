package less_19_Set_HashSet_LinkedHashSet_TreeSet.example;

import java.util.Comparator;

/**
 * TheSusanin
 * 28 апрель 2021
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo((o2).getName());
    }
}
class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        else if (o1.getAge() < o2.getAge())
            return -1;
        else
        return 0;
    }
}
