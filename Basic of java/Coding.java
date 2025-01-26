import java.util.*;
//QS.1  Create a program to input name of the person and respond with "welcome name to kg coding"
public class Coding {
  public static void main(String[] args) {
    System.out.print("Please enter your name:");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("welcome " + name + " to KG Coding");
  }  
}
