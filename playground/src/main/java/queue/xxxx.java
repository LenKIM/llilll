package queue;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xxxx {

    public static void main(String[] args) {
        String a = "/payment/123456789/cancel";
//        String b = "/payment/1234";
//        String c = "/payment/a1234/cancel";
//        String d = "/payment/1234567890/cancel";
//        String e = "/payment/1234/5678";
//
        String x = convert(a);

    }

    private static String convert(String input) {
        Pattern compile = Pattern.compile("/payment/[0-9]{1,9}/[a-zA-Z]{1,10}");
        Matcher matcher = compile.matcher(input);
        System.out.println(matcher.matches());
//        System.out.println(matcher.group());
        return "x";
    }
}
