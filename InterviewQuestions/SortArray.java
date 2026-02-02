package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 9- sort array
public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 77, 8, 4, 0, 44, 99};

        List<Integer> sortedArr = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

        System.out.println(sortedArr);

        List<Integer> revSorted = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(revSorted);
    }
}
