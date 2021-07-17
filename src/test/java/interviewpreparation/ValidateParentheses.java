package interviewpreparation;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateParentheses {
    public static void main(String[] args) {
        String inputString = "([{}])";
        System.out.println(isValid(inputString));

    }

    private static boolean  isValid(String inputString){

        Deque <Character>stack = new ArrayDeque<>();

        for (int i=0;i<inputString.length();i++){
        char ch=inputString.charAt(i);
            if (ch=='(' ||ch=='[' ||ch=='{' ){
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty())
                return  false;

            char popChar;
            switch (ch){
                case ')':
                    popChar=stack.pop();
                    if(popChar=='}' || popChar==']')
                        return false;
                    break;

                case ']':
                    popChar=stack.pop();
                    if(popChar=='}' || popChar==')')
                        return false;
                    break;


                case '}':
                    popChar=stack.pop();
                    if(popChar==']' || popChar==')')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
