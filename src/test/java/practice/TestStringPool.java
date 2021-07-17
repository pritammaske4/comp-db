package practice;

public class TestStringPool {
    public static void main(String[] args) {
        String s1 = "Pritam";
        String s2 = "Pritam";
        String s3 = new String("Pritam");
        String s4 = new String("Pritam");

        System.out.println("S1 Hashcode :"+s1.hashCode() );
        System.out.println("S2 Hashcode :"+s2.hashCode() );
        System.out.println("S3 Hashcode :"+s3.hashCode() );
        System.out.println("S4 Hashcode :"+s4.hashCode() );

    }
}
