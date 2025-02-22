package sixthweek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExceptionExample {
    public static void main(String[] args) {
        Pattern newPattern = Pattern.compile("Travelling");
        Matcher newMatcher = newPattern.matcher("I love travelling");

        if(newMatcher.find()){
            System.out.println("Exist");
        }
        else{
            System.out.println("Not exist");
        }

        String sentence = "College contact number 938583780";
        String replacedSentence = sentence.replaceAll("\\d", "@");
        System.out.println("New Sentence= " + replacedSentence);
    }
}
