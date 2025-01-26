 // Write a program to calculate electric bill using else if ladder as per the following rule
// Unit                                                                                       Price
// 0-100                                                                                 Rs 5 per unit
// 101-200                                                                             Rs  7 per unit
// 201-300                                                                             Rs 8 per unit
// 301-400                                                                             Rs   9 per unit
// Above 400                                                                         Rs 10 per unit.
// If total price is more than 1000 and less than 2000
// 5% discount
// Above Rs 2000-3000 
// 7%  and 
// Above 3000 
// a 10% discount will be added.


import java.util.Scanner;
import java.util.logging.Logger;
public class bill_calc 
{
  private static final Logger logger = Logger.getLogger(bill_calc.class.getName());
  public static void main(String[] args) 
  {
    int cost=0;
    int t_cost=0;
    int discount=0;
    Scanner ab= new Scanner(System.in);
    logger.info("Enter the units used:-");
    int unit =ab.nextInt();
    if (unit>=0 && unit<=100) 
    {
      cost=unit*5;
    }
    else if (unit>100 && unit<=200) 
    {
      cost=unit*7;
    }
    else if (unit>200 && unit<=300) 
    {
      cost=unit*8;
    }
    else if (unit>300 && unit<=400) 
    {
      cost=unit*9;
    }
    else if (unit>400) 
    {
      cost=unit*10;
    }

    if (cost>=1000 && cost<2000) 
    {
      discount=cost*(5/100);
    }
    else if (cost>=2000 && cost<3000) 
    {
      discount=cost*(7/100);
    }
    else if (cost>=3000) 
    {
      discount=cost*(10/100);
    }

    t_cost=cost-discount;
    logger.info("The cost is"+t_cost);
    ab.close();
  }

} 
}
