package studySwitch.coding.javamastery.LogicBuilding;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no you want as A");
        int a= sc.nextInt();
        System.out.println("Enter the no you want to use as B");
        int b=sc.nextInt();
        int c;
        System.out.println("value of a and b before swapping " +a +" "+b );
        c=a;
        a=b;
        b=c;
        System.out.println("value of a and b after swapping " +a +" "+b );

    }
}
