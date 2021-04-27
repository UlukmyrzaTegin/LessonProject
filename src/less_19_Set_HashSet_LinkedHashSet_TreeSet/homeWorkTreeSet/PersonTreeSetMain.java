package less_19_Set_HashSet_LinkedHashSet_TreeSet.homeWorkTreeSet;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * TheSusanin
 * 27 апрель 2021
 */
public class PersonTreeSetMain {
    public static void main(String[] args) {
        TreeSet<PersonTreeSet> treeSets = new TreeSet<>();
        treeSets.add(new PersonTreeSet("Tom", 35, 45000));
        treeSets.add(new PersonTreeSet("Nick", 28, 35000));
        treeSets.add(new PersonTreeSet("Alice", 45, 60000));
        treeSets.add(new PersonTreeSet("Bill", 25, 25000));

    }
}
