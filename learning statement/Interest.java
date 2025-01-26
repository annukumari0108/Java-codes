//calculate the simple interest
import java.util.Scanner;
public class Interest
 {
    public static void main(String[] args) 
    {
        float p,r,t,SI;
        Scanner SC= new Scanner(System.in);
        System.out.print("enter the principal");
        p= SC.nextFloat();
        System.out.print("enter the rate of interest");
        r= SC.nextFloat();
        System.out.print("enter the time period");
        t= SC.nextFloat();
        SI = (p*r*t)/100;
        System.out.print("Simple interest is: " +SI);
    }
}
