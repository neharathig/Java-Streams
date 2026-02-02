package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14 - int to stream array
public class IntToStringArr {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 77, 8, 4, 0, 44, 99};

        List<String> collect = Arrays.stream(numbers).boxed().map(n -> n + "").collect(Collectors.toList());

        System.out.println(collect);
    }
}
