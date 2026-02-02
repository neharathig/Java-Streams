package streamsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//3
public class OnlyPassedtudents {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(59);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(35);
        System.out.println(marks);
        List<Integer> updatedMarks = marks.stream().filter(i -> i>=35).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }

}
