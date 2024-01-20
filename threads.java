import java.lang.Thread;
import java.lang.Runnable;

public class threads implements Runnable {
    public static void main(String[] args) {
        threads t = new threads();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        System.out.println("Hello from the main thread! " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " ID: " + Thread.currentThread().getId());
        t1.start();
        t2.start();
    }

    public void run() {
        System.out.println("Hello from a thread! " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " ID: " + Thread.currentThread().getId());
        Thread.currentThread().interrupt();
        System.out.println("Is the thread interrupted? " + Thread.currentThread().isInterrupted());
    }
}