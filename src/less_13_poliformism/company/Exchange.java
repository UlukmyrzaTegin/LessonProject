package less_13_poliformism.company;

/**
 * TheSusanin
 * 3/17/2021
 */
public class Exchange  extends Company {
    public Exchange(String name) {
        super(name);
    }

    @Override
    public void payTaxes() {
        System.out.println("Вид деятельности на основе патентирования: Обменное бюро ");
        //super.payTaxes();
    }

    @Override
    public void report() {
        System.out.println("Вид отчета: Отчет по покупке и продаже наличной иностранной валюты");
        //super.report();
    }
}
