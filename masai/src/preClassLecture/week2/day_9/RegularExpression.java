package preClassLecture.week2.day_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        int count=0;
        Pattern p = Pattern.compile("ab");
        Matcher m= p.matcher("abcdkkaxabasabjkl");

        while(m.find()){
           count++;
           System.out.println(m.start() + "......"+ m.end() +"....." + m.group());
        }
        System.out.println("The number of occurance is "+count);
    }
}
