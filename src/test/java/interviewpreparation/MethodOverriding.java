package interviewpreparation;



public class MethodOverriding {
    private int a=10;
    protected int add (int a ,int b){
        return a+b;
    }
}

class Subclass extends MethodOverriding{

    public int add (int a , int b) {
        return a+b;
    }

    public static void main(String[] args) {

    }
}
