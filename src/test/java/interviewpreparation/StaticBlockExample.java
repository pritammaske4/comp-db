package interviewpreparation;

public class StaticBlockExample {
    static int a;
    static {
        a=20;
        System.out.println("Static block execute before main method ");
        int a=10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("in main method");
        System.out.println(a);
    }
}
