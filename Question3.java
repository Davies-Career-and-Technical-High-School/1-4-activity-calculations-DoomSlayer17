import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int r;
      System.out.println("Input a radius.");
      r = scan.nextInt();
      final double pi = 3.14;
      double c = 2*pi*r;
      double a = pi*r*r;
      System.out.println("The circumfrence is " + c);
      System.out.println("The area is " + a);

        /* Write your code here */

    }
}