package less_9_ClassObject.Example.Constructor;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Rectangle {
    int length;
    int width;
    void insert (int L, int Width) {
        length = L;
        width = Width;
    }
    void calculateArea() {
        System.out.println(length * width);
    }
}
