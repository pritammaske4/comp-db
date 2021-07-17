package test;


public class Mahesh {



    public void display(Object object){
        System.out.println("Object");
    }

    public void display(String s) throws Exception {
        System.out.println("Srting");
        throw new Exception();
    }

    public static void main(String[] args) {
        short a=10;
        short b=20;
        int c=0;
        c=a+b;
        byte x=2;
        byte y=9;
        int z=0;
         z=x+y;
    }


}
class B extends Mahesh{
        public void display(String s){
            System.setProperty("","");

    }
}


