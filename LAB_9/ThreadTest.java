package LAB_9;

public class ThreadTest {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();

        System.out.println("Main is started");
        
        thread1.start();

        try {

            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        System.out.println("Main has ended");
    
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
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        System.out.println("Thread has ended");
        
    }
}
