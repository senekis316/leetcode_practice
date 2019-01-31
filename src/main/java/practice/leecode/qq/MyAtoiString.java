package practice.leecode.qq;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoiString {

    public int myAtoi(String str) {

        String regex = "^\\s*[+-]?[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String num_str = matcher.find() ? matcher.group(0).replace(" ", "") : "0";

        boolean right = num_str.charAt(0) == '-' ? false : true;

        Integer result = 0;
        try {
            result = Integer.valueOf(num_str);
        } catch (NumberFormatException e) {
            return right ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return result;

    }

}
