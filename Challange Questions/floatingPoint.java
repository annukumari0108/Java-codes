import java.util.*;
public class floatingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing float multiplication\n");
        System.out.println("Please enter first decimal number:");
double first = input.nextDouble();
System.out.println("Now, please enter second number:");
double second = input.nextDouble();

double mul = first*second;
System.out.println("\n result is :" + mul);
    }
}
