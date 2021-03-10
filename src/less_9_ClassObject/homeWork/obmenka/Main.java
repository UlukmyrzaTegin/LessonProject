package less_9_ClassObject.homeWork.obmenka;

/**
 * TheSusanin
 * 02 март 2021
 */
public class Main {
    public static void main(String[] args) {

        Currency kgz = new Currency("kgz", 1);
        Currency usd = new Currency("usd", 85.6);
        Currency euro = new Currency("euro", 101.34);

        Money kgzMoney = new Money(10000, kgz);
        Money usdMoney = new Money(100, usd);
        Money euroMoney = new Money(10, euro);

        Converter converter = new Converter("Invest");
        converter.monies = new Money[]{kgzMoney, usdMoney, euroMoney};
        converter.show();
        System.out.println("___________________________________");

        if (converter.exists("usd", 100)) {
            Money money = converter.sell("usd", 100);
            System.out.println(money.amount + " " + money.currency.value);

        }
        System.out.println("__________________________________");
        converter.show();
    }
}
