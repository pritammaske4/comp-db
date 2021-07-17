package basic;

import java.io.FileNotFoundException;

public class ChainingExample {
    public  void  m () throws FileNotFoundException {
            n();
    }

    public void n() throws FileNotFoundException {

        throw  new FileNotFoundException();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new ChainingExample().m();
    }
}
