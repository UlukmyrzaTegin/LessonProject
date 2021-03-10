package less_13_poliformism.models;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class Programmer extends Employee {
    private String lang;

    public Programmer(String name, double salary, String lang) {
        super(name, salary);
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public void work() {
        //super.work();
        System.out.println("Чтобы работать, он должен кодить");
    }

    @Override
    public void spendMoney() {
      //  super.spendMoney();
        System.out.println("отдыхаю");
    }

    @Override
    public void dance() {
        System.out.println("Танцую");
    }
}
