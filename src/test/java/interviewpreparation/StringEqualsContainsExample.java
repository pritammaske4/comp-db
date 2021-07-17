package interviewpreparation;

public class StringEqualsContainsExample {

    public static void main(String[] args) {
        String s1="pritam";
        StringBuffer s2= new StringBuffer("pritam");

        if (s1.contains(s2)){
            System.out.println("correct contains");
        }

//        if (s1==s2){
//            System.out.println("correct ==");
//        }else{
//            System.out.println("wrong ==");
//        }

        if (s1.equals(s2)){
            System.out.println("correct equals");
        }
    }
}
