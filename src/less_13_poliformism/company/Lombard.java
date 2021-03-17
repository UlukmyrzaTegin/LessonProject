package less_13_poliformism.company;

/**
 * TheSusanin
 * 3/17/2021
 */
public class Lombard extends MainCompany {


    public Lombard(String name) {
        super(name);
    }


    @Override
    public void work() {
        System.out.println("Скупка золота");
        //super.work();
    }
}
