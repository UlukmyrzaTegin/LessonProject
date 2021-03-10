package less_9_ClassObject.homeWork.cook.models;

/**
 * TheSusanin
 * 04 март 2021
 */
public class Cook {
    private String name;
    private int age;

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

    public Cook(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cook() {
    }

    private Product[] getProduct(String name) {
        return null;

    }

    private void breakEggs() {   //разбить яйца

    }

    public Dish cook(String name) {
        Product[] products = getProduct(name);

        if (name.equals("Омлет")) {
            breakEggs();
        }
        return new Dish();

    }

//    public void cookMethod(String menu){
//        System.out.println(name + " " + age + " года");
//        switch (menu) {
//            case "Глазунья":
//                System.out.println("Глазунья:");
//                System.out.println("Разбить яйца");
//                System.out.println("Выложить на скороводку");
//                System.out.println("Посолить");
//                System.out.println("Поперчить");
//                System.out.println("Жарить");
//                break;
//            case "Омлет:":
//                System.out.println("Омлет:");
//                System.out.println("Разбить яйца");
//                System.out.println("Перемещать");
//                System.out.println("Добавить молоко");
//                System.out.println("Выложить на скороводку");
//                System.out.println("Посолить");
//                System.out.println("Поперчить");
//                System.out.println("Жарить");
//                break;
//            default:
//                System.out.println("Я не умею готовить " + menu);
//                break;
//        }
        //   }
}

