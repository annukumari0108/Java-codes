import java.util.*;
//Create a program to convert fahrenheit to celsicus 
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature coverter");
        System.out.println("Enter your temp in F:");
        float fah = input.nextFloat();
        float cel = (Fah-32)*5/9;
        System.out.println("Your temperature is:" +cel +fah);
    }
}
