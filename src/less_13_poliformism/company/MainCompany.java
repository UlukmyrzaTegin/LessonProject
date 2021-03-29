package less_13_poliformism.company;

/**
 * TheSusanin
 * 3/17/2021
 */
public class MainCompany {

    public static void main(String[] args) {
        Lombard lombard = new Lombard("Alfa");
        lombard.work();
        Exchange exchange = new Exchange("Invest");
        exchange.payTaxes();
        exchange.report();
    }
}
