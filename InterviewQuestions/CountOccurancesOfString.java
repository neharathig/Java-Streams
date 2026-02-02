package interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//count occurances of words in string
//2
public class CountOccurancesOfString {
    public static void main(String[] args) {
        String str = "Hello World ! I will be a software engineer at google soon. World is amazing.";

        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);
    }
}
