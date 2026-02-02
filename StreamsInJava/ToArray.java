package streamsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//9
public class ToArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Integer[] arr = list.stream().toArray(Integer[] :: new );
        Stream.of(arr).forEach(System.out :: println);
    }
    }
