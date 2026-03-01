package mastercardcodingpractise.problems.interview;

import java.util.Arrays;
import java.util.List;

public class EvenOddPractise {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,34,5,6,7,8);
        List<Integer>evenlist=list.stream()
                .filter(n->n%2==0)
                .toList();

        System.out.println(evenlist);
    }
}
