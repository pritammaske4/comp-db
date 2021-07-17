package interviewpreparation;

public class ExecutionSequenceExample {

    {
        System.out.println("Instance block");
    }



    public static void display(){
        ExecutionSequenceExample e = new ExecutionSequenceExample();
        System.out.println(e.hashCode());
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutionSequenceExample executionSequenceExample = null;
        executionSequenceExample.display();
        System.out.println("inside main");
    }

}
