package streamsInJavaCC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //From Collection
        List<Integer> list = Arrays.asList(1000, 2000, 2500);
        Stream<Integer> streamList = list.stream();

        //From Array
        Integer[] arr = {1, 2 , 3 , 4};
        Stream<Integer> strArr = Arrays.stream(arr);

        //From Static method
        Stream<Integer> stStatic = Stream.of(1,2,3,5, 8);

        //From Stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();

        streamBuilder.add(100).add(200).add(300);

        Stream<Integer> strB = streamBuilder.build();


        //From Stream iterate
        Stream<Integer> strIter = Stream.iterate(1000, (Integer n)-> n + 5).limit(5);

       strIter.forEach(System.out :: println);

    }
}
