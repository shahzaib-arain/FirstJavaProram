class Thread1 extends Thread{
    public int i=0;
    public void run(){
        while (i<30){
            System.out.println("My Threading is running ");
            System.out.println("I am Sad");
        }

    }
}
class Thread2 extends Thread{
    public int i=0;
    public void run(){
        while (i<30){
            System.out.println("My Threading is still execute this program ");
            System.out.println("I am happy ");
        }

    }
}
public class ThreadingJava {
    public static void main(String[] args) {
            Thread1 t1=new Thread1();
            Thread2 t2=new Thread2();
            t1.start();
            t2.start();


    }
}
