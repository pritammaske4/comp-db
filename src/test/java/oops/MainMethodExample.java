package oops;

public class MainMethodExample {
    protected   int a=1;

    protected void display(){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        System.out.println("Main class");
    }
}

class SubSAmple extends  MainMethodExample{
    public void display(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        StringBuilder s1=new StringBuilder("Test");
        String s2="Java";
        s1.append(s2);
        System.out.println(s1);
        s1.substring(4);
        System.out.println(s1);
        int a=s1.indexOf("Prit");
        System.out.println(a);
    }
}

