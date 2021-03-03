package less_10_method.Example;

/**
 * TheSusanin
 * 03 март 2021
 */
public class AccessorMutatorMethod {
    private int roll;
    private String name;
    public int getRoll() { //accessor method - считывает переменную экземпляра геттер, возвращает значение / используется для получения значения частного поля.
        return roll;
    }

    public void setRoll(int roll) { // mutator method - считывают переменные экземпляра, а так изменяют значения. Он ничего не возвращает, принимает того же типа данных, который зависит от поля
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }
}
