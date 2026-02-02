package streamsInJavaCC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperators {
    public static void main(String[] args) {
        //filter
        Stream<String> words = Stream.of("How", "are", "you", "sanskrutI", "Yash", "Google", "Microsoft");
        Stream<String> filteredStream =  words.filter((String s) -> s.length() <= 3);

        List<String> filteredList = filteredStream.collect(Collectors.toList());

        System.out.println(filteredList);

        //map;
        Stream<String> words1 = Stream.of("How", "are", "you", "sanskrutI", "Yash", "Google", "Microsoft");

        Stream<String> mappedStream = words1.map((String s) -> s.toLowerCase());

        List<String> mappedList = mappedStream.collect(Collectors.toList());

        System.out.println(mappedList);

        //FlatMap
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I ", "Love ", "Java. " ),
                Arrays.asList("SpringBoot ", "& ", "MS ", "are ", "Interesting. "),
                Arrays.asList("Its ", "easy. ")
        );

        Stream<String> str = sentenceList.stream().flatMap((List<String> s) -> s.stream());

        Stream<String> str1 = sentenceList.stream().flatMap((List<String> list) -> list.stream().map((String s) -> s.toLowerCase()));

        str.forEach(System.out :: print);
        System.out.println();
        str1.forEach(System.out :: print);
        System.out.println();

        //Distinct
        Integer[] arr = {55, 77, 99, 44, 88, 77, 99, 44};
        List<Integer> integerStream = Arrays.stream(arr).distinct().collect(Collectors.toList());

        System.out.println(integerStream);

        //Sorted

        List<Integer> soretedList = Arrays.stream(arr).sorted().collect(Collectors.toList());
        List<Integer> rSoretedList = Arrays.stream(arr).sorted((a,b) -> b-a).collect(Collectors.toList());

        System.out.println(soretedList);
        System.out.println(rSoretedList);

        System.out.println();

        //peek
        Integer[] arrr = {515, 77, 199, 344, 884, 779, 99, 44};

        Stream<Integer> streamPeak = Arrays.stream(arrr).filter((Integer n) -> n %2 == 0).
                                    peek((Integer val) -> System.out.println(val))
                                    .map((Integer val) -> -1 * val);

                        // streamPeak.forEach(System.out :: println);

        List<Integer> result = streamPeak.collect(Collectors.toList());

        System.out.println(result);

        // limit
        Integer[] ar = {515, 77, 199, 344, 884, 779, 99, 44};
        List<Integer> limitedList = Arrays.stream(ar).limit(3).collect(Collectors.toList());

        System.out.println(limitedList);

        //skip

        List<Integer> skippedList = Arrays.stream(ar).skip(3).collect(Collectors.toList());

        System.out.println("S"+ skippedList);

        System.out.println();

        //mapToInt
        int[] intAr = {5, 6, 4 ,3 ,8};

        IntStream numberStream = Arrays.stream(intAr).filter((int n) -> n %2 == 1);

        numberStream.forEach(System.out :: println);

    }
}
