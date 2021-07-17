package practice;

public class Example1 {
    public static void main(String[] args) {
        int num=100101010;
        int i;
        for ( i=2;(num/2)%i !=0;i++);
        if (num/2==i){
            System.out.println("Prime");
        }else{
            System.out.println("NOt prime");
        }

    }
}
