package basic;

public class TryExample {

    public void show()  {
        try {
            System.out.println("inside try");
              new Exception();
        }
        finally {
            System.out.println("inside finally");
        }
            System.out.println("outside");

    }

    public static void main(String[] args)  {
        new TryExample().show();
    }
}
