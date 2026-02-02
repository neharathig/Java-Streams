package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5 - length of word in string array
public class StringArrayWordLength {
    public static void main(String[] args) {
        String[] arr = {"amazon","apple","facebook","google","leetcode"} ;

        List<Integer> collect = Arrays.stream(arr).map(String::length).collect(Collectors.toList());

        System.out.println(collect); //prints length array

        Map<String, Integer> collect1 = Arrays.stream(arr).collect(Collectors.toMap(word -> word, word -> word.length()));
        System.out.println(collect1);

    }
}
