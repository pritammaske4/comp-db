package interviewpreparation;

import com.herokuapp.automation.InstanceStatic;

public class StaticExample {
    static  StaticExample staticExample;

    public static  StaticExample getInstance(){
        if (staticExample==null){
            staticExample = new StaticExample();
        }
        return staticExample;
    }

    public void showValue(){
        System.out.println("Value");
    }
    public static void main(String[] args) {
        System.out.println("Hi...");
        InstanceStatic instanceStatic = null;
        instanceStatic.display();

        InstanceStatic i = new InstanceStatic();
        i.display();
    }
}
