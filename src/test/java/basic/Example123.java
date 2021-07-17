package basic;

class A{
//    static {
//        System.out.println("A");
//    }

    public A(){
        System.out.println("A constr");
    }
}

public class Example123 extends A {
    static {
        System.out.println("123");
    }
    public Example123(){
        System.out.println("123 constr");
    }

    public static void main(String[] args) {
        Example123 e= new Example123();
        A a= new A();
    }
}
