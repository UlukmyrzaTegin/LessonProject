package less_12_inheritance.exercises;

/**
 * TheSusanin
 * 09 март 2021
 */
public class Animal {

    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("Я ем кость");
    }
    public void sleep() {
        System.out.println("Я сплю");
    }
}
