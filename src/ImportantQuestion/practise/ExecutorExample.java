package ImportantQuestion.practise;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable
{
   public void run()
    {
        System.out.println("Using the executors service for the thread running "+ Thread.currentThread().getId());

    }

}

class MyTask2 extends Thread
{

    public void run()
    {
        System.out.println("thread is running using the thread class");
    }

}


//using the executors for running the thread here
public class ExecutorExample {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(4);

        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());

        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask2());


        //shutting down the thread
        executor.shutdown();



    }
}
