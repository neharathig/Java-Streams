package interviewQuestions;

import java.util.List;
import java.util.stream.Collectors;


//4 - distinct characters in string
public class StringToCharSet {
    public static void main(String[] args) {
        String str = "Hello World";

        List<Character> collect = str.chars().mapToObj(e -> (char) e).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
