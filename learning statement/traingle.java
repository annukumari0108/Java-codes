//area of tringle

import java.util.Scanner;
//import java.lang.Math;


public class traingle {
    public static void main(String[]args)
    {
        int a,b,c,sp; double area;
        System.out.print("enter value for sides of traingle");
        Scanner r= new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("area of triangle" + area);

    }
}

