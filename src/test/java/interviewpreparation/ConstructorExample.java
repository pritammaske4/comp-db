package interviewpreparation;

 class ParentClass{
     static {
         System.out.println("Parent static block");
     }

     public ParentClass(){
         System.out.println("Inside Parent constructor");
     }

     public ParentClass(int a){
         System.out.println("Parameterized Parent  Constructor "+a);
     }
 }

public class ConstructorExample extends ParentClass{

    static {
        System.out.println("Child static block");
    }

  public  ConstructorExample()  {
      //this();//
      //super();// this() and super() cannot go hand in hand


      //second sce
      //this(); // recursive constructor invocation

      //super(); // ok

      System.out.println("Child Constructor");
  }

  public ConstructorExample(int a){
      System.out.println("Child Parameter constructor");
  }

  public void display(){
        System.out.println("inside display");
    }

    public static void main(String[] args) {
//        ConstructorExample co = new ConstructorExample();
        ConstructorExample con = new ConstructorExample(3);
    }

}

class  Demo{
     public Demo(){
         System.out.println("Inside Demo cons");
     }

    public static void main(String[] args) {
        Demo demo = new Demo();
    }
}
