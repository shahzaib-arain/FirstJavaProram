import java.util.Scanner;

class  Calculator {
    int num1;
    int num2;

    public int Addition(int n, int m) {
        this.num1 = n;
        this.num2 = m;
        return num1 + num2;
    }

    public int Division(int n, int m) throws ThrowException {
        this.num1 = n;
        this.num2 = m;
        if (n > 10000) {
            throw new ThrowException("Your number is greater than 10000");
        }
        return num1 / num2;
    }

    public int Subtraction(int n, int m) {
        this.num1 = n;
        this.num2 = m;
        return num1 - num2;
    }

    public int Multiplication(int n, int m) throws ThrowException {
        this.num1 = n;
        this.num2 = m;
        if (n > 7000) {
            throw new ThrowException("Don't perform multiplication if your input is greater than 7000");
        }
        return num1 * num2;
    }
}

class ThrowException extends Exception {
    public ThrowException(String message) {
        super(message);
    }
}

public class CalculatorUsingThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator t = new Calculator();
        boolean flag = true;
        while (flag) {
            System.out.println("1 is for Addition");
            System.out.println("2 is for Subtraction");
            System.out.println("3 is for Multiplication");
            System.out.println("4 is for Division");
            System.out.println("Enter Your choice ...");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter two numbers");
                    System.out.println(t.Addition(sc.nextInt(), sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    System.out.println(t.Subtraction(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    try {
                        System.out.println(t.Multiplication(sc.nextInt(), sc.nextInt()));
                    } catch (ThrowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter two numbers");
                    try {
                        System.out.println(t.Division(sc.nextInt(), sc.nextInt()));
                    } catch (ThrowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
