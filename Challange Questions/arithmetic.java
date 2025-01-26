import java.util.*;

public class arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to arithmetic calculator\n");
        System.out.println("Please enter first number:");
        int first = input.nextInt();
        System.out.println("Now, Please enter second number:");
int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first *second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: "+add);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("divide is: "+div);
        System.out.println("modulus is: "+mod);
    }
}
