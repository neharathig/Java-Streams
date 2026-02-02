package interviewQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//0
//count the occurrences of given character in string
public class GivenCharOccCount {
    public static void main(String[] args) {
        String s = "wsedfghbnmsHHdfcgvbnm";
        char c = 'h';
        char C = 'H';
        long count = s.chars().filter(e -> e == c || e == C).count();
        System.out.println(count);
    }
}
