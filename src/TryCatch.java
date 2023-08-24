public class TryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
     //   int c = a / b;
     //   System.out.println("the sum of a / b is " + c);

        try {
            int c = a / b;
            System.out.println(" the result is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide . Reason :");
            System.out.println(e);
        }
        System.out.println("YOUR program is finished ...");

    }
}