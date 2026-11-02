package SimpleInterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddprint {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        long evenelements=numbers.stream().filter(n->n%2 ==0)
                .count();
        long oddlements=numbers.stream().filter(n->n%2 ==0)
                .count();
        System.out.println("Even elemetns are total :" + evenelements);
        System.out.println("Odd elements are total :" +);
    }
}
