package mastercardcodingpractise.problems.interview;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractise {
    public static void main(String[] args) {

        List<List<String>>flatmapelement= Arrays.asList(

                Arrays.asList("Rohan", "Ruhsi"),
                Arrays.asList("Aniket ", "Tejas")

        );

        List<String>normallist=flatmapelement.stream()
                .flatMap(List::stream)
                .filter(s->s.startsWith("R"))
                .toList();

        System.out.println(normallist);
    }
}
