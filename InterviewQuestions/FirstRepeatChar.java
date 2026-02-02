package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

//8- -first repeat character
public class FirstRepeatChar {
    public static void main(String[] args) {
        String word = "aabbccffggjjhhuuttmmradha";

        Character key = word.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();

        System.out.println(key);
    }
}
