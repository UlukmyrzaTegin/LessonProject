package less_16_MapHashMap.treeMap;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * TheSusanin
 * 26 апрель 2021
 */

public class MainThreeMap {
    public static void main(String[] args) {
        TreeMap<Double, Student> studentTreeMap = new TreeMap<>();
        Student stud1 = new Student("Иван", "Иванов", "Java", 7000);
        Student stud2 = new Student("Нудар", "Камберов", "Flutter", 8000);
        Student stud3 = new Student("Нурлан", "Мирлан уулу", "JavaScript", 15000);
        Student stud4 = new Student("Анна", "Сидорова", "Python", 12000);
        Student stud5 = new Student("Адилет", "Алмазов", "Android", 3500);
        Student stud6 = new Student("Максат", "Бектурсунов", "C#", 9500);

        Student[] students = {stud1, stud2, stud3, stud4, stud5, stud6};

        System.out.println("Сортировка по цене: ");
        Arrays.sort(students, new Student.ComparatorCoursePrice());
        for (Student price : students) {
            System.out.println(price);
        }

        System.out.println("-------------------------");
        System.out.println("Сортировка по курсу: ");
        Arrays.sort(students, new Student.ComparatorCourseCourses());
        for (Student courses : students) {
            System.out.println(courses);
        }

        System.out.println("-------------------------");
        System.out.println("Сортировка по имени: ");
        Arrays.sort(students, new Student.ComparatorCourseName());
        for (Student names : students) {
            System.out.println(names);
        }

        System.out.println("-------------------------");
        System.out.println("Сортировка по возрастанию оценкам: ");
        studentTreeMap.put(5.0, stud6);
        studentTreeMap.put(6.2, stud2);
        studentTreeMap.put(6.2, stud4);
        studentTreeMap.put(8.3, stud2);
        studentTreeMap.put(9.0, stud5);
        System.out.println(studentTreeMap);

        System.out.println("-------------------------");
        System.out.println("Добавился новый студент с оценкой: ");
        Student stud7 = new Student("Эмил", "Калыбекович", "Java", 7000);
        studentTreeMap.put(7.6, stud7);
        System.out.println(studentTreeMap);

        System.out.println("-------------------------");
        System.out.println("Вывести студентов оценка которого свыше 8.0: ");
        System.out.println(studentTreeMap.tailMap(8.0));

        System.out.println("-------------------------");
        System.out.println("Вывести студентов оценка которого ниже 8.0: ");
        System.out.println(studentTreeMap.headMap(8.0));


        System.out.println("-------------------------");
        System.out.println("Удалить студенка оценка которого 5.0");
        System.out.println("Студент удален: " + studentTreeMap.remove(5.0));
        System.out.println(studentTreeMap);

        System.out.println("-------------------------");
        System.out.println("Сортировка по убыванию оценкам: ");
        System.out.println(studentTreeMap.descendingMap());


    }
}
