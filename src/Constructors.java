import java.util.Scanner;
import java.util.SplittableRandom;

class employeesM{
    private int id ;
    private String name;
    public employeesM(int id, String name){
        this.name=name;
        this.id=id;
    }
    public String  getName(){
        return name;
    }
    public int getID(){
        return id;
    }


}
public class Constructors {
    public static void main(String[] args) {
        System.out.println("USING CONSTRUCTORS");
        Scanner sc=new Scanner(System.in);
        
        employeesM [] worker = new employeesM[3];
        for (int i = 0; i <3; i++) {
            System.out.println("Enter the "+(i+1)+"st person ID");
            int id=sc.nextInt();
            System.out.println("Enter the " +(i+1)+"st person Name");
            String name=sc.next();

            worker[i]=new employeesM(id,name);
        }
        System.out.println("Workers Details");
        for (int i = 0; i <3 ; i++) {
            System.out.println("Employee"+(i+1)+" Id :"+worker[i].getID()+"\nEmployee "+(i+1)+" Name :"+worker[i].getName());

        }



    }

    }

