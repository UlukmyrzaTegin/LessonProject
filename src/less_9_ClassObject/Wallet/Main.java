package less_9_ClassObject.Wallet;

/**
 * TheSusanin
 * 2/23/2021 Feb 2021
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = " Kairat";
        person.age = 24;

        Wallet wallet = new Wallet();
        wallet.model = "Gucci";
        wallet.price = 2000;

        Money kgz = new Money();
        kgz.currency = "KGZ";
        kgz.amount = 10000;

        Money usd = new Money();
        usd.currency = "KGZ";
        usd.amount = 200;

        Money eur = new Money();
        eur.currency = "EUR";
        eur.amount = 100;

        Money[] walletMoney = {kgz, usd, eur}; // инициализация массива
//        for (int i = 0; i < walletMoney.length ; i++) {
//            System.out.println(person.name + person.wallet.money[i].currency + person.wallet.money[i].amount);
//            }
//        walletMoney[0] = kgz;
//        walletMoney[1] = usd;
        wallet.money = walletMoney;
        person.wallet = wallet;

        System.out.println(person.name + " " + person.wallet.money[0].currency + " " + person.wallet.money[0].amount);
        System.out.println(person.name + " " + person.wallet.money[1].currency + " " + person.wallet.money[1].amount);


    }
}
