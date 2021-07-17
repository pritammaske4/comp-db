package interviewpreparation;

public class StaticAndInstanceBlockExample {
    static{
        System.out.println("inside static block");
    }

    {
        System.out.println("Inside instance block");
    }

    public static void main(String[] args) {
        new StaticAndInstanceBlockExample();
        new StaticAndInstanceBlockExample();
        System.out.println("inside main method");
    }
}
