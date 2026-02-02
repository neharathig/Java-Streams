package interviewQuestions;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Java program to count occurrences of each character in string
//1
public class CountOccurances {
    public static void main(String[] args) {
        String str = "Hello World";
        String word ="facebook";
        Map<Character, Long> collect = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        Map<Character, Long> hm = word.chars().mapToObj(e-> (char) e).collect(Collectors.groupingBy(e->e, Collectors.counting()));

        Map<Character, Long> map = str.codePoints().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Map<Character, List<Character>> collect2 = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.toList()));
        System.out.println(collect2);

    }
}
