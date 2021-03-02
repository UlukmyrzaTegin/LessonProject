package less_10_constructor.Constructor;

/**
 * TheSusanin
 * 01 март 2021
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();   //Class Rectangle
        Rectangle rectangle2 = new Rectangle();
        rectangle1.insert(11, 5);
        rectangle2.insert(3, 15);
        rectangle1.calculateArea();
        rectangle2.calculateArea();

    }
}
