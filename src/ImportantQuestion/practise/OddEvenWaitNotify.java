package ImportantQuestion.practise;


class Printer
{

  private int number=1;
  private final int limit=10;

  public synchronized void printodd() throws InterruptedException
  {
      while(number<=limit)
      {
          if(number%2==0)
          {
              wait();

          }
          System.out.println("odd :" +number);
          number++;
          notify();
      }


  }

public synchronized void printeven() throws InterruptedException
{

    while(number<=limit)
    {
        if(number%2!=0)
        {
            wait();

        }
        System.out.println("even :" +number);
        number++;
        notify();

    }
}


}

public class OddEvenWaitNotify {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread oddThread = new Thread(() ->
        {

            try {
                printer.printodd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread evenThread = new Thread(() -> {
            try { printer.printeven(); } catch (Exception e) {}
        });

        oddThread.start();
        evenThread.start();

    }
    }

