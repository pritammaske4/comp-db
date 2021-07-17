package interviewpreparation;

public interface InterfaceExample {
    int a=10;
    void display();
    void show();
    void add();
    default void present(){
        //java has introduced default method to support backword compatibility
        //in other words if we want to implement new feature in existing interface then we can do it using default
        //methods
        System.out.println("inside present method");
    }


    static void print(){

        System.out.println("inside static method of interface");
    }
}
