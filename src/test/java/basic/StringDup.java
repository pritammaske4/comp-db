package basic;

public class StringDup {
    public static void main(String[] args) {
        String s="aabbcccwwwwwwwwwwwwwwwwwwe";
        String n="";

        for (int i=0;i<=s.length()-1;i++){
            if(i==s.length()-1) {
                n = n + s.charAt(i);
                break;
            }
            if (!(s.charAt(i)==s.charAt(i+1))){
                n=n+s.charAt(i);
            }

        }

        System.out.println(n);

    }
}
