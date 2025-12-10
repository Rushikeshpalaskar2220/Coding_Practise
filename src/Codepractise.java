import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class  Codepractise{

    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,3,4,5,6,7,7,8,8,9);

        //working on the set
        Set<Integer>set=list.stream().collect(Collectors.toSet());

        //working on the hashset to find the unique element
        HashSet<Integer>set2= new HashSet<>(list);

        System.out.println(set);

        System.out.println(set2);


    }
}
