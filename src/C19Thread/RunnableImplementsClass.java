package C19Thread;

public class RunnableImplementsClass implements Runnable{
    @Override
    public void run() {
        System.out.println("RunnableImplementsClass :" + Thread.currentThread().getName());

    }
}
