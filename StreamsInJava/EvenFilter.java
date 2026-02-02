package streamsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//1
public class EvenFilter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        System.out.println(list);
        List<Integer> l2 = list.stream().filter(i -> i %2 ==0).collect(Collectors.toList());
        System.out.println(l2);

    }
}
