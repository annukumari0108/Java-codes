import java.util.*;
public class Age {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name");
        String name = input.nextLine();
        System.out.println("Good morning" +name);
        System.out.println(name +",Also tells me yourage");
        int age = input.nextInt();
        System.out.println("your age is:" +age);
    }
}
