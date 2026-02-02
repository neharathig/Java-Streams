package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

//12 - longest string in given array
public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"amazon","apple","facebook","google","leetcode", "microservices"} ;

        String s = Arrays.stream(arr).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();

        System.out.println(s);

        String s1 = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).get();

        System.out.println(s1);


    }
}
