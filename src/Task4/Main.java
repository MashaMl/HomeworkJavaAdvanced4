package Task4;

public class Main {
    public class MyThread extends Thread{
        @Override
        public void run() {
            Thread thread = new Thread();
            thread.setDaemon(true);
            thread.start();
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setDaemon(true);

    }
}
