package less_5_boolean.humanIMB;

/**
 * TheSusanin
 * 16 февраль 2021
 */
public class humanIMB {

    public double Weight;
    public double Height;
    private static double imb;

    public humanIMB(double weight, double height) {
        Weight = weight;
        Height = height;
        imb = Weight / (Height * Height);

    }

    public double takeWeight() {
        return Weight;
    }

    public void putWeight(double weight) {
        Weight = weight;
        imb = Weight / (Height * Height);
        //  Weight = weight;
    }

    public double takeHeight() {
        return Height;
    }

    public void pHeight(double height) {
        Height = height;
        imb = Weight / (Height * Height);
    }

    public static double takeImb() {
        return imb;
    }

    public static String Result() {
        String string = null;
        if (imb >= 18.5 & imb < 25) {
            string = "Норма, ты в форме!";
        }
        if (imb >= 25 & imb < 30) {
            string = "Предожирение. Эй, поосторожнее с пирожными ";
        }
        if (imb >= 30) {
            string = "Ожирение. SCHWEINE! Хватить жрать, иди на треню!";
        }
        if (imb < 18.5) {
            string = "Дефицит массы тела. В модели решили переквалицироваться?";
        }
        return string;
    }
}

