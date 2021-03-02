package less_9_ClassObject.homeWork;

/**
 * TheSusanin
 * 02 март 2021
 */
public class Converter {
    String name;
    Money[] monies;
    Currency currency;


    public Converter(String name) {
        this.name = name;
        monies = new Money[5];
    }

    public boolean exists(String value, double amount) {
        for (Money money : monies ) {
            if (money.currency.value.equals(value)) {
                return money.amount >= amount;
            }
        }
        return false;
    }
    //
    public Money findByCurrencyValue(String value) {
        for (Money money : monies) {
            if (money.currency.value.equals(value)) {
                return money;
            }
        }
        return null; // ссли нет, возвращаем нул
    }
        //
    public Money sell (String from,double amount){
        Money fromMoney = findByCurrencyValue(from);
        Money kgz = findByCurrencyValue("kgz"); // тот, и тот найти

        // посчитаем
        fromMoney.amount -= amount;
        kgz.amount += amount * fromMoney.currency.rate;

        return new Money(amount * fromMoney.currency.rate, kgz.currency);
    }

    public void show() {
        for (Money money : monies) {
            System.out.println(money.amount + " " + money.currency.value);
        }
    }
}
