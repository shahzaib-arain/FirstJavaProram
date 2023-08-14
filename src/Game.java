import java.util.Scanner;
import java.util.Random;
class games {
  public int number;
  public int inputNumber;
  public int numberOfGuesses;
  public int setNoOfGuesses(){
      return numberOfGuesses;
  }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    games(){
        Random rand=new Random();
        int computerInput=rand.nextInt(100);

   }
   void takeInput(){
       System.out.println("Guess the number");
       Scanner sc=new Scanner(System.in);
       inputNumber= sc.nextInt();
   }
   boolean IsCorrectNumber(){
      numberOfGuesses++;
      if(inputNumber==number){
          System.out.format("Yes you guess it right,it was %d\nYou guess it in %d attempts",number,numberOfGuesses);
          return true;

      } else if (inputNumber<number) {
          System.out.println("too low...");
          
      } else if (inputNumber>number) {
          System.out.println("too high...");

      }
      return false;
   }
public class Game {

    public static void main(String[] args) {
       games g=new games();
       boolean b=false;
       while(b){
           g.takeInput();
           b=g.IsCorrectNumber();
           System.out.println(b);
       }

       }


    }
}
