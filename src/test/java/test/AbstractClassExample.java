package test;

public abstract class AbstractClassExample {

    public AbstractClassExample(){
        System.out.println("Inside abstract class Constructor");
    }

}

class ExtendsAbstract extends  AbstractClassExample{
    public ExtendsAbstract(){
        System.out.println("inside extent constr");
    }

    public ExtendsAbstract(int a){
        System.out.println("inside param extent con");
    }

    public static void main(String[] args) {
        ExtendsAbstract e = new ExtendsAbstract(2);
    }
}


class PTest{

    public PTest(){
        System.out.println("Parent cons");
    }

}

class CTest extends PTest {

//    public CTest(){
//        System.out.println("Child Cons");
//    }
//
//    public CTest(int a){
//        System.out.println("child param cons");
//    }

    public static void main(String[] args) {
        CTest c = new CTest();

    }
}