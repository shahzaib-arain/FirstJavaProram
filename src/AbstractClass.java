import java.security.PublicKey;

abstract class Parent{
    public Parent(){
        System.out.println("I am the constructor of Parent");
    }
    public void SayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("Good");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
       // Parent p=new Parent();    Error
        Child c=new Child();
        // Child2 d=new Child2();   Error We can not make the abstract class objects
        // we want to inherit the class and give implementation of those method which is in super class .




    }
}
