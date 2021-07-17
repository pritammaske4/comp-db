package interviewpreparation;

public class Singleton {

    private static final Object obj= new Object();
    private static volatile Singleton singleton =null;

    public static Singleton getInstance(){
        if (singleton!=null)
            return singleton;

        synchronized (obj) {
          return singleton = new Singleton();
        }
    }
}

class TestSingleTon{
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1= Singleton.getInstance();
        System.out.println("Hashcode 1 : " +singleton );
        System.out.println("Hashcode 2 : " +singleton1 );
    }
}
