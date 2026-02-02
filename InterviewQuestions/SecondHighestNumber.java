package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//10 - second - highest number in given array
public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 77, 8, 4, 0, 44, 99};

        Integer secHigh = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secHigh);

    }
}
