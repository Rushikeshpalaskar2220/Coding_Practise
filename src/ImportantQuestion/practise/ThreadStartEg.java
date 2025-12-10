package ImportantQuestion.practise;

class Mythread extends Thread
{

    public void run()
    {
        System.out.println("Thread is running");
    }

}


class Mythread2 extends Thread
{

    public void run()
    {
        System.out.println("Thread is running");
    }

}



public class ThreadStartEg {
    public static void main(String[] args) {
        Mythread thread=new Mythread();
        thread.start();
        System.out.println(  thread.getId());
        Mythread2 thread2=new Mythread2();
        System.out.println(  thread2.getId());
    }
}
