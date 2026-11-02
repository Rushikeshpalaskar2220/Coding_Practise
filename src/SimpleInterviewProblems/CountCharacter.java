package SimpleInterviewProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String s="Rushikesh";

        Map<Character,Long>frequency=s.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));//counting
        System.out.println(frequency);

    }
}
