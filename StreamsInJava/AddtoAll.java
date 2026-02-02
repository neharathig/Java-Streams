package streamsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//2
public class AddtoAll {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(30);
        System.out.println(marks);
        List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}
