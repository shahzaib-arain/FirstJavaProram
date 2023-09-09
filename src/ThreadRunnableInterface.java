class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("I am the thread 1 not a threat ");
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("I am the thread 2 not a threat");

        }
    }
}
public class ThreadRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        // bullet1.start(); // this method cant be run we make a thread option to implements a bullet
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();



    }
}
