package interviewpreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String inputString ="12prit23am2";
        String regX="\\d+";

        Pattern pattern = Pattern.compile(regX);
        Matcher matcher = pattern.matcher(inputString);

        int sum=0;
        while (matcher.find()){
            sum=sum+Integer.parseInt(matcher.group());
        }

        System.out.println("Sum : "+sum);
    }

}
