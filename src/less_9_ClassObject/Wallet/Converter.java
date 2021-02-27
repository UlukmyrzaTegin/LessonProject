package less_9_ClassObject.Wallet;

/**
 * TheSusanin
 * 2/23/2021 Feb 2021
 */
public class Converter {

    public  double usdToKgz(double rate, double sum) {
        return  sum * rate;
    }
    public  double kgzToUsd(double rate, double sum) {
        return  sum / rate;

    }
}
