package streamsInJavaCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        //foreach
        Integer[] arr = {55, 77, 99, 44, 88, 77, 99, 44};
        Stream<Integer> integerStream = Arrays.stream(arr).distinct();

        integerStream.forEach(System.out :: println);

        //toArray
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        System.out.println(list);

        Object[] objArr = list.stream().filter((Integer n) -> n >= 15).toArray();

        Integer[] intArr = list.stream().filter((Integer n) -> n >= 15).toArray(Integer[]::new);

        System.out.println("s"+ Arrays.toString(intArr));

        // Reduce
        Optional<Integer> reducedVal = Arrays.stream(arr).reduce(Integer::sum);

        System.out.println(reducedVal.get());


        //min and max

        Integer min = list.stream().min((i1,i2)-> i1 - i2).get();
        System.out.println(min);
        Integer max = list.stream().max((i1,i2)-> i1 - i2).get();
        System.out.println(max);

        // count
        long count = list.stream().count();
        System.out.println(count);

        //anyMatch

        boolean anyEx = list.stream().anyMatch((Integer val) -> val > 20);
        System.out.println(anyEx);

        //allMatch
        boolean allEx = list.stream().allMatch((Integer val) -> val < 310);
        System.out.println(allEx);

        //nonematch
        boolean noneEx = list.stream().noneMatch((Integer val) -> val >=  50);
        System.out.println(noneEx);

        //findfirst
        Optional<Integer> firstMatch = list.stream().findFirst();
        System.out.println(firstMatch.get());

        //findAny
        Optional<Integer> anyMatch = list.stream().findAny();
        System.out.println(anyMatch.get());
    }
}
