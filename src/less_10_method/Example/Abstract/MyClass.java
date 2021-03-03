package less_10_method.Example.Abstract;

import less_10_method.Example.Abstract.AbstractMethod;

public class MyClass extends AbstractMethod {
     void display() {
         System.out.println("Abstract method ?");
    }

    public static void main(String[] args) {
        AbstractMethod object = new MyClass();
        object.display();
    }
}
