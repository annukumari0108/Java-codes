import java.util.*;
//QS2. Create a program to add two numbers
public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.println("Please enter 1st number");
        int firstNum = input.nextInt();
        System.out.println("Now, Please enter 2nd number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum of your numbers:" + sum);
    }
}
