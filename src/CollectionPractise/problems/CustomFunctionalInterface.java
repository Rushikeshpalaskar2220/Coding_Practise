package CollectionPractise.problems;

import static java.sql.DriverManager.println;

@FunctionalInterface
interface Calculator
{

    int calculate(int a, int b);

}



public class CustomFunctionalInterface {
    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;
        Calculator multiply=(a,b)->a*b;

        System.out.println("Addition :"+ add.calculate (5,4));
        System.out.println("Multiplication :" +multiply.calculate(2,3));


    }
}
