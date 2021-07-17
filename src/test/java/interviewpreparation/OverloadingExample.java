package interviewpreparation;

public class OverloadingExample {

    public void show(String s){

    }

    public void show(Object o){
    }

    public void show(OverloadingExample o){
    }

    public static void main(String[] args) {
      //new  OverloadingExample().show(null);//ambiguous method call
    }


}


