package interviewQuestions;

import java.util.Arrays;
import java.util.Optional;

//11 - third - lowest number in given array
public class ThirdLowestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 77, 8, 4, 0, 44, 99};

        Integer val = Arrays.stream(numbers).boxed().sorted().skip(2).findFirst().get();

        System.out.println(val);
    }
}
