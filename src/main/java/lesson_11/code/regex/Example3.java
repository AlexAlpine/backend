package lesson_11.code.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args) {
        String inputString = "code 2 learn java regex";
        // ------
        String regex = "[a-j]+";
        // -----

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputString);

        int matchCounter = 0;

        while (matcher.find()){
            matchCounter++;

            System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
            System.out.println("Number of match: " +matchCounter );
        }


    }
}
