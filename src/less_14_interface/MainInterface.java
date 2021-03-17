package less_14_interface;

import less_14_interface.models.EmployeeInterface;

/**
 * TheSusanin
 * 3/17/2021
 */
public class MainInterface {
    //Абстрактный и Интерфейс классы - это которого нельзя создать обьекты, они является шаблонами
    //В абстракном классе все методы - без тела. В интерфейсе нельзя принимать модификатор доступа т.к все методы является default
    //В абстрактном классе можно создать поля, а в интерфейсе нет(int COUNTER = 1;).
    //static - все статичное переменные и методы принадлежить к классу и принимается, когда всем нужны, а не статичное к обьектам.
    //Интерфейс - свод и инструкция для каждого обьекта.


    public static void main(String[] args) {
        //нестатичное
//        EmployeeInterface employeeInterface = new EmployeeInterface();
//        employeeInterface.getName();

        //статичное
       // EmployeeInterface.companyName = "MegaCom";

    }
}
