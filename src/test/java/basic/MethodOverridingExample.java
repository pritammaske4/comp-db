package basic;

public class MethodOverridingExample {
    public  String add(int a, int b){
        System.out.println(a+b);
        return "";
    }
}

class Child extends MethodOverridingExample{
    @Override
    public String add (int a ,int b){
//        return 0;
        return "";
    }
}
