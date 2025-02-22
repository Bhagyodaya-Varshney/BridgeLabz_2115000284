package Java_Regex;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static Set<String> extractRepeatingWords(String st) {
        Set<String> set = new HashSet<>();
        Matcher m = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)").matcher(st);
        while (m.find())
            set.add(m.group(1));
        return set;
    }

    public static void main(String[] args) {
        System.out.println(extractRepeatingWords("This is is a repeated repeated word test."));
    }
}
