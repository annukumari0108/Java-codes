import java.util.*;
//Qs3. Create a program to swap two numbers
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping station\n\n");
        System.out.println("Enter value of A:");
        int a = input.nextInt();
        System.out.println("Enter value of B:");
        int b = input.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("Swapping done...");
        System.out.println("value of A is: " +a);
        System.out.println("value of B is: " +b);
    }
}
