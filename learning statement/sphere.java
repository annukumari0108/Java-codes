//volume of a sphere

import java.util.Scanner;
public class sphere
 {
public static void main(String[]args)
{
final double PI=3.14,volume;
int r;
System.out.print("enter the volume of a sphere");
Scanner ref=new Scanner(System.in);
r=ref.nextInt();
volume=4/3*PI*r*r*r;
System.out.print("volume of a sphere" +volume);
}
    
}
