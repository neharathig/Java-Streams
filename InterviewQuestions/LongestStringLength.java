package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//13 - longest string in given array
public class LongestStringLength {
    public static void main(String[] args) {
        String[] arr = {"amazon","apple","facebook","google","leetcode", "microservices"} ;

        Integer lngstrlen = Arrays.stream(arr).map(e -> e.length()).max(Integer::compareTo).get();

        System.out.println(lngstrlen);

    }
}
