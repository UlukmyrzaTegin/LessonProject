package less_13_poliformism.company;

/**
 * TheSusanin
 * 3/17/2021
 */
public class MainCompany {
    private String name;

    public MainCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){

    }

    public void payTaxes() {

    }

    public void report() {

    }

    public static void main(String[] args) {
        Lombard lombard = new Lombard("Alfa");
        lombard.work();
        Exchange exchange = new Exchange("Invest");
        exchange.payTaxes();
        exchange.report();
    }
}
