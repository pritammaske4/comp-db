package interviewpreparation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis {
    public static void main(String[] args) {
        String inputString="(({}))";
        System.out.println(isValid(inputString));
    }

    private static boolean isValid(String inputString){
        Deque<Character> stack= new ArrayDeque<>();
        for (int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);

            if (ch=='('){
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty())
                return false;

            if (ch==')')
                stack.pop();

//            switch (ch){
//                case ')':
//                    stack.pop();
//                    break;
//            }

        }
        return stack.isEmpty();
    }
}
