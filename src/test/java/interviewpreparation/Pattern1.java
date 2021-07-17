package interviewpreparation;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int k=5;k>i;k--)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print("*");
            for (int j=0;j<i;j++)
                System.out.print("*");

            System.out.println();
        }

        StaticExample staticExample = new StaticExample();
        staticExample.showValue();

       StaticExample st =  StaticExample.getInstance();
       st.showValue();
    }
}
