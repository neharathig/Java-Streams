package streamsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//8
public class ForEachFun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.stream().forEach(System.out :: println);

        Consumer<Integer> f = i ->
        {
            System.out.println("The square of " + i + " is "+ i*i);
        };

        list.stream().forEach(f);
    }
}
