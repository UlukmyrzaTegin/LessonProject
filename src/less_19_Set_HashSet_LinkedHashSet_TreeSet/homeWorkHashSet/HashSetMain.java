package less_19_Set_HashSet_LinkedHashSet_TreeSet.homeWorkHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * TheSusanin
 * 27 апрель 2021
 */
public class HashSetMain {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(90);
        hashSet1.add(1);
        hashSet1.add(0);
        hashSet1.add(45);
        hashSet1.add(67);

        HashSet<Integer> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(7);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        hashSet2.add(54);
        hashSet2.add(6);

        System.out.println("-------------------------------");
        System.out.println("Обьединение: ");
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        System.out.println("-------------------------------");
        System.out.println("Пересечение: ");
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        System.out.println("-------------------------------");
        System.out.println("Разность: ");
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);




    }
}
