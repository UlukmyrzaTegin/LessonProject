package less_12_inheritance.classWork.models;

/**
 * TheSusanin
 * 10 март 2021
 */
public class Cooker extends Person {
    public Cooker(String name, int age) {
        super(name, age);
    }

    @Override
    public void relax() {
        System.out.println(getName() + "-dancing"); // потанцую
        //super.relax(); // сначала потанцую, а потом пойду спать
    }
}
