package basic;

public class StaticMethodOverriding {
    public static void show(){
        System.out.println("parent");
    }
}

class  B extends StaticMethodOverriding{
    public static void show(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        StaticMethodOverriding a = new StaticMethodOverriding();
        StaticMethodOverriding a1= new B();
        B b = new B();

        a.show();
        a1.show();
        b.show();
    }
}

