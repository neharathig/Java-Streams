package streamsinjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//7
public class MinMaxValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);

        Integer min = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = list.stream().min(Comparator.reverseOrder()).get();
        System.out.println(max);

        

    }
}
