package CollectionPractise.problems;

import java.util.Arrays;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Avocado","Xebra","Banana","Apple");
        //sorting in the ascending order
        list.sort((s1,s2)->s1.compareTo(s2));

        list.forEach( System.out::println);

        //sorting in the decending order

        list.sort((s3,s4)->s4.compareTo(s3));
        list.forEach(System.out::println);
    }
}
