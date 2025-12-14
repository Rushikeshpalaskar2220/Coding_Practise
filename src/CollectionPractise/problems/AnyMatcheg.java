package CollectionPractise.problems;

import java.util.*;
import java.util.stream.Collectors;

public class AnyMatcheg {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>() ;
        list.add("Hello");
        list.add("Aniket");
        list.add("Apple");

      //Starts with for filtering the list
        List<String>list2=list.stream()
                .filter(s->s.startsWith("A"))
                .toList();

        System.out.println(list2);

        HashMap<Integer,String>h1=new HashMap<>();
         h1.put(1,"Rushi");
         h1.put(2,"Rushi");
         h1.put(3,"Aniket");

        System.out.println(h1);

        //checking the value if that present in the hashmap
        Boolean h2=h1.containsValue("Rus");
        System.out.println(h2);

        Set<String>uniquevalue=new HashSet<>(h1.values());


        //unique value storing in the hashmap
        System.out.println(uniquevalue);




    }
}
