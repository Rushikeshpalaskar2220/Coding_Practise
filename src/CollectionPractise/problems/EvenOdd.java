package CollectionPractise.problems;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10);
        List<Integer>list2=list.stream()
                .filter(n->n%2==0)
                .toList();
       // Map<Boolean,List<Integer>> m1=list.stream().map

       // Iterable<Integer>it=new Iterator<list2>();

        list2.forEach(System.out::println);
Map<Boolean, List<Integer>> result=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
List<Integer>evenlist=result.get(true);
List<Integer>oddlist=result.get(false);

        System.out.println(result);


        //System.out.println(list2);

    }
}
