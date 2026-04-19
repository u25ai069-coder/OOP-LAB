package LAB_9;

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println("Main is started");
        
        MyThread thread1 = new MyThread();

        System.out.println("Main is ended");

        thread1.start();
    }
}

class MyThread extends Thread {

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
