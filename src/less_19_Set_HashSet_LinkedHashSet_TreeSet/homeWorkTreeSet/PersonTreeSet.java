package less_19_Set_HashSet_LinkedHashSet_TreeSet.homeWorkTreeSet;

import java.util.Comparator;

/**
 * TheSusanin
 * 27 апрель 2021
 */
public class PersonTreeSet implements Comparator<PersonTreeSet>{
    private String name;
    private int age;
    private double salary;

    public PersonTreeSet(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonTreeSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(PersonTreeSet o1, PersonTreeSet o2) {
        return (o1).getAge() - (o2).getAge();
    }

    static class ComparatorBySalary implements  Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return (int) (((PersonTreeSet) o1).getSalary() - ((PersonTreeSet)o2).getSalary());
        }
    }

    static class ComparatorByName implements  Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return ((PersonTreeSet) o1).getName().compareTo(((PersonTreeSet)o2).getName());
        }
    }
}

