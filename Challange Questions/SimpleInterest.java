import java.util.Scanner;

public class SimpleInterest {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.println("Welcome to simple interest calculator\n");
      System.out.println("Please enter your principle amount Rs");
      int principle = input.nextInt();
      System.out.println("Now, tell me your rate of interest:");
      float rate = input.nextFloat();
      System.out.println("Now, tell me for how many years are you borrowing this money:");
      float years = input.nextFloat();

      float interest = (principle * rate * years)/100;
System.out.println("\n\n your simple interest is Rs:" + interest);
   } 
}
