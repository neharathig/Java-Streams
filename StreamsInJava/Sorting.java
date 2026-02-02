package streamsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//5
public class Sorting {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(59);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(35);
        System.out.println(marks);
        List<Integer> l2 = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3 = marks.stream().sorted((i1,i2)->i2-i1).collect(Collectors.toList());
        System.out.println(l3);

        //soring Strings
        List<String> list = new ArrayList<>();
        list.add("radha");
        list.add("krishna");
        list.add("shyam");
        list.add("ram");
        list.add("sita");
        System.out.println(list);
        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
        List<String> list2 = list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(list2);
        List<String> list3 = list.stream().sorted((s1,s2)-> - s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(list3);

    }
}
