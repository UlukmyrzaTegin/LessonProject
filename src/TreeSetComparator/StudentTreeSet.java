package TreeSetComparator;

/**
 * TheSusanin
 * 28 апрель 2021
 */
public class StudentTreeSet {
    private String name;
    private int age;
    private String course;
    private double price;

    public StudentTreeSet(String name, int age, String course, double price) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
