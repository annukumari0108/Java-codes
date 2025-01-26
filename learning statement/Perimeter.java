//perimeter of circle=2.22/7.r

//perimeter of circle
import java.util.Scanner;
public class Perimeter
 {
    public static void main(String args[])
    {
        final double PI=3.14,area;
        int r;
        System.out.print("enter radius of perimeter");
        Scanner ref = new Scanner(System.in);
        r = ref.nextInt();
        area = 2*PI*r;
        System.out.print("area of perimeter" +area);
    }
    
}
