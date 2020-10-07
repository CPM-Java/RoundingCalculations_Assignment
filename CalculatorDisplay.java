
/**
 * User interface for the Calculator.
 * 
 * @author GK CPM 2107
 * @version gk mods 9/22/15, 9/18/17
 */
import java.util.Scanner;

public class CalculatorDisplay
{
    //This object is an instance variable so it can be used in any method
    //within the object of type CalculatorDriver.
    private Scanner scan = new Scanner (System.in);

    public void displaySphere()
    {
       double radius;
       
       System.out.print("Enter the radius of a sphere: ");
       radius = scan.nextDouble();
       
       String ans = DoesTheMath.calcSphere(radius);
       System.out.println(ans);
    }
    
    
    public void displayDistance()
    {
       int x1, y1, x2, y2;  // where the points are (x1,y1) (x2,y2)

       System.out.println("where (x1,y1) (x2,y2)");
       System.out.print("Enter x1: ");
       x1 = scan.nextInt();
       
       System.out.print("Enter y1: ");
       y1 = scan.nextInt();
       
       System.out.print("Enter x2: ");
       x2 = scan.nextInt();
       
       System.out.print("Enter y2: ");
       y2 = scan.nextInt();
       
       String ans = DoesTheMath.calcDistance(x1, y1, x2, y2);
       System.out.println(ans);
    }
}
