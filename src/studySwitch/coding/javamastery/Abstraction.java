package studySwitch.coding.javamastery;

abstract class payment{

       abstract void paymentdatabase();

}

class phonepay extends payment
{
      void paymentdatabase()
      {
          System.out.println("phonepay use postgrese database ");
      }

}


class gpay extends payment
{
    void paymentdatabase()
    {

        System.out.println("gpay use cassandra database ");
    }
}


public class Abstraction {
    public static void main(String[] args)
    {
        payment g1=new gpay();
        payment p1=new phonepay();

        g1.paymentdatabase();
        p1.paymentdatabase();




    }
}
