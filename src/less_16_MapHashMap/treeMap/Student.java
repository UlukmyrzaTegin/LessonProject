package less_16_MapHashMap.treeMap;

import java.util.Comparator;

/**
 * TheSusanin
 * 26 апрель 2021
 */
public class Student implements Comparator<Student> {
    private String name;
    private String surname;
    private String course;
    private int price;

    public Student(String name, String surname, String course, int price) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.price = price;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

    public static class ComparatorCourseCourses implements  Comparator {

        @Override
        public int compare(Object o1, Object o2) {

           return ((Student) o1).course.compareTo(((Student) o2).course); // сортировка по курсу
        }
    }

    public static class ComparatorCoursePrice implements  Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Student) o1).price - ((Student) o2).price; //сортировка по цене
        }
    }

    public static class  ComparatorCourseName implements  Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Student) o1).name.compareTo(((Student)o2).name); // сортировка по имени
        }
    }

//    static class ComparatorCourseAppraisal implements  Comparator{
//        @Override
//        public int compare(Object o1, Object o2) {
//            return (int) (((Student) o1).appraisal - ((Student) o2).appraisal); //сортировка по оценкам
//        }
//    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.course;
    }
}
