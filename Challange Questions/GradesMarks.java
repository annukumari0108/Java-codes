import java.util.*;
public class GradesMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator\n");
        System.out.println("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println(" Great, You have got A");
        }else if(percentage >= 75){
         System.out.println("Good, you have got B");
        } else if(percentage >= 60){
           System.out.println("you have got C, work harder next time");
        } else if(percentage >= 30){
            System.out.println("you have got D, you seriously need to work harder");
        } else{
            System.out.println("sorry, you have failed the test and got a f");
        }
    }
}
