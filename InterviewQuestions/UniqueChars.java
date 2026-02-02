package interviewQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "Hello World";

        List<Character> collect = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

        Set<Character> characterSet = str.chars().mapToObj(e -> (char) e).distinct().collect(Collectors.toSet());
        System.out.println(characterSet);

    }
}
