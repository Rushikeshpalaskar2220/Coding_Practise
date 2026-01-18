package ImportantQuestion.practise;

class MyRunnable implements Runnable
{


    @Override
    public void run() {

        System.out.println("Running thread using the thread implements method runnable ");

    }
}

class MyRunnable2 extends Thread
{

    public void run()
    {

        System.out.println("Running of the thread using the thread class");
    }

}

public class ThreadusingRunnable {

    public static void main(String[] args) {

        MyRunnable thread2=new MyRunnable();
        MyRunnable2 thread3=new MyRunnable2();
        thread2.run();
        thread3.start();

        Thread thread4=new Thread(()-> System.out.println("Running it using the functional interface "));
        thread4.start();

        Runnable task=new Thread(()-> System.out.println("Running of the thread using the runnable as functionainterface "));
        Thread thread5=new Thread(task);
        thread5.start();





    }
}
