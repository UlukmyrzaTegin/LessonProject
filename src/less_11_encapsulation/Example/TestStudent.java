package less_11_encapsulation.Example;

/**
 * TheSusanin
 * 03 март 2021
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();  // Создание экземпляра инкапсулированного класса
        student.setName("Ulukmyrza");  // установка значения в класса имени
        System.out.println(student.getName()); // получение значения имени класса
    }
}
