
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("enter two numbers");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        System.out.println("before swapping" + a + "" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping" + a + "" + b);
    }
}
