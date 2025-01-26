 import java.util.*;
 public class OddEven {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to odd even calculator\n");
    System.out.println("please enter your number:");
    int num = input.nextInt();

    if(num % 2 == 0){
        System.out.println("Your number is an even number");
    } else{
        System.out.println("Your number is an odd number");
    }
   } 
}
