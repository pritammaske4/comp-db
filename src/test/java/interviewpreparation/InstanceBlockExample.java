package interviewpreparation;

public class InstanceBlockExample {

    {
        System.out.println("Inside instance block");
    }

    public static void main(String[] args) {
        new InstanceBlockExample();
        System.out.println("Inside main method");
    }
}
