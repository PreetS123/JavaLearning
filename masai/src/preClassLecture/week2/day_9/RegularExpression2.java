package preClassLecture.week2.day_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("x");
        Matcher m= p.matcher("abcdylx@23");
        while(m.find()){
            System.out.println(m.start()+"........"+m.group());
        }
    }
}
