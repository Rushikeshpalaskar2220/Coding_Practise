package CollectionPractise.problems;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employeee
{
    private int id;
    private String name;
    public Employeee(int id, String name) {

        this.id=id;
        this.name=name;

    }

    public int getId()
    {

        return id;

    }

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeEg2 {

    public static void main(String[] args) {
        List<Employeee>employees= Arrays.asList(

                new Employeee(1,"Alice"),
                new Employeee(2,"Bob"),
                new Employeee(1,"Alex")


        );


      //  Stream<Employeee> stream=employees.stream();

        Map<Integer,List<Employeee>>grouped=employees.stream().collect(Collectors.groupingBy(Employeee::getId));
        employees.forEach(System.out::println);

        System.out.println("Grouped : " +grouped);



    }




}
