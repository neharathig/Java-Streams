package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;

//7 -first non repeat character
public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String word = "aabbccffggjjhhuuttmmradha";

         Character firstNonRepeatingChar = word.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream().
                filter(e -> e.getValue() == 1).findFirst().get().getKey();

        System.out.println(firstNonRepeatingChar);




    }
}
