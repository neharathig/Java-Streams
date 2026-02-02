package interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// 6 - char count in array
public class CharCountInArray {
    public static void main(String[] args) {
    String[] arr = {"amazon","apple","facebook","google","leetcode"} ;

    Map<Character, Long> map =   Arrays.stream(arr).flatMapToInt(word -> word.chars()).mapToObj(e -> (char)e).
                collect(Collectors.groupingBy(e-> e, Collectors.counting()));

     System.out.println(map);
    }
}
