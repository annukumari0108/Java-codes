import java.util.*;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.print("Please enter your age:");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("you got 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount");
        } else {
            System.out.println("you got no discount");
        }
    }
}
