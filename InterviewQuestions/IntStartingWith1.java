package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//15
public class IntStartingWith1 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 77, 8, 4, 0, 44, 99, 41, 21, 17,1, 91};

        List<String> collect = Arrays.stream(numbers).boxed().map(e -> e + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());

        System.out.println(collect);
    }
}
