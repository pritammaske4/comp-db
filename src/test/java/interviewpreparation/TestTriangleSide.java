package interviewpreparation;

public class TestTriangleSide {
    public static void main(String[] args) {
        System.out.println(isTriangle(7,2,2));
    }

    public static boolean isTriangle(int a, int b, int c)
    {
        if(a<0 & b<0 & c<0)
            return false;

        if (a+b>c & b+c>a & c+a>b)
            return true;

        return false;
    }
}
