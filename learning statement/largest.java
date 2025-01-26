import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("enter first number:");
        int a = SC.nextInt();
        System.out.println("enter second number:");
        int b = SC.nextInt();
        System.out.println("enter third number:");
        int c = SC.nextInt();
        // appraochi logic
        if (a > b && a > c) {
            System.out.println(a + "largest number:");
        } else if (b > a && b > c) {
            System.out.println(b + "largest number:");
        } else {
            System.out.println(c + " largest number:");
        }
    }
}
