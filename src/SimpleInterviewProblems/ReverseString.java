package SimpleInterviewProblems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {

        String s="Rushi";
        String t="";
        String k=s;

        for (int i=s.length()-1;i>=0;i--)
        {

            t+=s.charAt(i);


        }

        System.out.println(t);


        StringBuilder sb=new StringBuilder(s);
        String l=sb.reverse().toString();

        System.out.println(sb);

       if (l.equals(k))
        {
            System.out.println("the string is pallindrome ");
        }

       else
        {

            System.out.println("It is not the pallindrome ");
        }

   //checking directly via true and false
       boolean ispallindrome= IntStream.range(0,s.length()/2)
               .allMatch(i->s.charAt(i)==s.charAt(s.length()-i-1));

        if (ispallindrome)
            System.out.println("The string is pallindrome");
        else
            System.out.println("The string is not pallindrome ");



        //storing to reverse
        String reverse=IntStream.range(0,s.length())
                .mapToObj(i->s.charAt(s.length()-i-1))
                        .map(String::valueOf)
                                .collect(Collectors.joining());

        System.out.println(reverse);



    }
}
