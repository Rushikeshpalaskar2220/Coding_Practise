package CollectionPractise.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNO {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,4,5,5,6);

        //printing the different no in the arraylist
         list.stream().distinct().forEach(System.out::println);

         //storing the elements in the set

        HashSet<Integer>h1=new HashSet<>(list);

        //printing the no directly using the for each and the other printing methods
        System.out.println(h1);
        h1.forEach(System.out::println);

        Iterator<Integer>it= h1.iterator();
        while(it.hasNext())
        {
           Integer elem= it.next();
            System.out.println("the element printing using the has next is "+elem);

        }

    }
}
