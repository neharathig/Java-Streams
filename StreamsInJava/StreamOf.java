package streamsinjava;

import java.util.stream.Stream;

//10
public class StreamOf {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(9,99,999,999,99999);
        s.forEach(System.out :: println);

        Integer[] i = {10,20,30,40,50};
        Stream.of(i).forEach(System.out::println);
        int min = Stream.of(i).min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(min);
    }
}
