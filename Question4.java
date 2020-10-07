import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double p;
      System.out.println("What is the price?");
      p = scan.nextDouble();
      double m = 20.00;
      double c = m - p;
      System.out.println("Change from $20: $" + c);

        /* Write your code here */

    }
}