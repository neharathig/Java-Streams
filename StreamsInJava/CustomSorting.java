package streamsinjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//6
public class CustomSorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("AAAAAA");
//        list.add("AA");
//        list.add("AAA");
        list.add("radha");
        list.add("krishna");
        list.add("shyam");
        list.add("ram");
        list.add("sita");
        list.add("lala");



        System.out.println(list);
        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        //To sort string by length
        Comparator<String> c = (s1, s2) ->
        {
            int l1 = s1.length();
            int l2 = s2.length();
            // to sort in ascending order
            if(l1 < l2)
            {
                return -1;
            }
            else if( l1 > l2)
            {
                return 1;
            }
            else  // if length of the string is same, sort by their name
            {
                return s1.compareTo(s2);
            }
        };
        List<String> list3 = list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(list3);
    }
}
