package interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java program to find duplicates Characters in given string
//3
public class DuplicateChars {
    public static void main(String[] args) {
        String str = "Hello World! I will be a software engineer at google soon.";

        List<Character> duplicateElements = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateElements);


        Set<Character> set1 = new HashSet<>();
        Set<Character> characterSet = str.chars().mapToObj(e -> (char) e).filter(e -> !set1.add(e)).collect(Collectors.toSet());
        System.out.println(characterSet);


        //using Arrays.stream


        List<String> duplicateElements1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting())).
                entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicateElements1);

        Set<String> set = new HashSet<>();
        Set<String> collect = Arrays.stream(str.split("")).filter(e -> !set.add(e)).collect(Collectors.toSet());
        System.out.println(collect);


    }
}
