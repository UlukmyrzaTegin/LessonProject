package TreeSetComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * TheSusanin
 * 28 апрель 2021
 */
public class ProgramTreeSet {
    public static void main(String[] args) {
        Comparator<StudentTreeSet> comparator = new StudentNameComparator().thenComparing(new StudentCourseComparator().thenComparing(new StudentPriceComparator()));
        TreeSet<StudentTreeSet> studentTreeSets =new TreeSet<>(comparator);
        studentTreeSets.add(new StudentTreeSet("Adilet", 27, "Java", 7000));
        studentTreeSets.add(new StudentTreeSet("Tom", 45, "Flutter", 9000));
        studentTreeSets.add(new StudentTreeSet("Jerry", 52, "Big Data", 12000));
        studentTreeSets.add(new StudentTreeSet("Obama", 31, "Data Science", 15000));
        studentTreeSets.add(new StudentTreeSet("Misha", 29, "PHP", 4000));
        studentTreeSets.add(new StudentTreeSet("Oleg", 42, "Oracle", 6800));
        studentTreeSets.add(new StudentTreeSet("Dima", 35, "C#", 7500));
        studentTreeSets.add(new StudentTreeSet("Nurik", 22, "Python", 8000));

        System.out.println("Сортировка имен по имени: ");
        for (StudentTreeSet name : studentTreeSets )
            System.out.println(name.getName() + " " + name.getCourse() + " " + name.getPrice());
    }
}

    class StudentNameComparator implements Comparator<StudentTreeSet> {

        @Override
        public int compare(StudentTreeSet o1, StudentTreeSet o2) {
            return o1.getName().compareTo((o2).getName());
        }
    }

    class StudentCourseComparator implements Comparator<StudentTreeSet> {

        @Override
        public int compare(StudentTreeSet o1, StudentTreeSet o2) {
            return o1.getCourse().compareTo((o2).getCourse());
        }
    }

    class StudentPriceComparator implements Comparator<StudentTreeSet> {

        @Override
        public int compare(StudentTreeSet o1, StudentTreeSet o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }
