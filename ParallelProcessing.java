package streamsInJavaCC;

import java.util.ArrayList;
import java.util.List;

public class ParallelProcessing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(3);
        list.add(11);
        list.add(5);
        list.add(1);
        list.add(175);
        list.add(208);
        list.add(309);

        long seqTime =  System.currentTimeMillis();
        list.stream().map((Integer val) -> val * val).forEach(System.out :: println);
        System.out.println("Seq Processing Time : " + (System.currentTimeMillis() - seqTime));

        long parrTime =  System.currentTimeMillis();
        list.parallelStream().map((Integer val) -> val * val).forEach(System.out :: println);
        System.out.println("Parr Processing Time : " + (System.currentTimeMillis() - parrTime));

    }
}
