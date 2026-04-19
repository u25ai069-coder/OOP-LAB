package LAB_9;

public class RunnableTest {
    public static void main(String[] args) {
        
        System.out.println("Main is started");
        
        MyRunnable mr = new MyRunnable();
        Thread thread2 = new Thread(mr);
        thread2.start();

        System.out.println("Main is ended");

        
    }
}

class MyRunnable implements Runnable {

    @Override 
    public void run() {

        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        System.out.println("Thread is Running");

        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

    }
}
