//squarre two numbers

import java.util.Scanner;
class Square
{
    public static void main(String[] args)
     {
        int side,area;
        System.out.print("Enter side square");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();
        area=side*side;
        System.out.print("Area of square" + area);
        r.close();
     }
}
