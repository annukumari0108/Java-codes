                  //area of circle
                //area of circle=22/7r2
import java.util.Scanner;
public class circle
 {
    public static void main(String[] args)
     {
        final double PI=3.14,area;
        int r;
        System.out.print("enter radius of circle");
        Scanner ref = new Scanner(System.in);
        r=ref.nextInt();
        area=PI*r*r;
        System.out.print("area of circle" +area);
    }
}
