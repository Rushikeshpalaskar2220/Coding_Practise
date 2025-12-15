package CollectionPractise.problems;


import java.util.Arrays;
import java.util.List;

class Employee
{
    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;


    public Employee(int id, String name ,int age, String gender,double salary)
    {

        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;


    }
    public String getGender() {

        return gender;

    }


    public double getSalary() {

        return salary;

    }

    @Override

    public String toString() {

        return String.format("Employee{id=%d, name='%s', age=%d, gender='%s', salary=%.2f}", id, name, age, gender, salary);

    }


}

public class EmployeeEg {
    public static void main(String[] args) {

        List<Employee>employees= Arrays.asList(

                new Employee(1,"Rushi",25,"Male",90000),
                new Employee(1,"Rushi",25,"Male",90000),
                new Employee(1,"Rushi",25,"Male",90000)


        );

        System.out.println(employees);

    }
}
