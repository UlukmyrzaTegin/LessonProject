package less_9_ClassObject.homeWork.cook.models;

/**
 * TheSusanin
 * 04 март 2021
 */
public class Cook {
     private String fullName;
     private int age;

    public Cook(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Cook() {
    }
    private Product[] getProduct(String name) {  //возвращает список продуктов
        return null;

    }

    public Dish cook(String name) {
        System.out.println(fullName + " " + age + " года");
        Product[] products = getProduct(name);  //Если это блюдо то, дай мне эти продукты
        System.out.println();
        if (name.equals("Глазунья")) {
            breakEggs();
            vylojitNaSkovorodku();
            posolit();
            popershit();
            jarit();
        } else if (name.equals("Омлет")){
            breakEggs();
            shuffle();
            addMilk();
            vylojitNaSkovorodku();
            posolit();
            popershit();
            jarit();
        } else {
            System.out.println("Я не умею готовить " + name);
        }
        return new Dish();
    }
    class Product{

    }
    class Dish{

    }
    private void breakEggs() {   //разбить яйца
        System.out.println("Разбить яйца");
    }
    private void vylojitNaSkovorodku(){
        System.out.println("Выложить на сковородку");
    }
    private void posolit(){
        System.out.println("Посолить");
    }
    private void popershit(){
        System.out.println("Поперчить");
    }
    private void jarit(){
        System.out.println("Жарить");
    }

    private void shuffle() {
        System.out.println("Перемещать");
    }
    private void addMilk(){
        System.out.println("Добавить молоко");
    }
}

