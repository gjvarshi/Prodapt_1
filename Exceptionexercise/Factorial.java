package samp;
import java.util.*;
class MathUtils{
	public static int factorial(int n) {
	int fac=1;
	for(int i=n;i>0;i--)
		fac*=1;
	    return fac;
	}
}
public class Factorial {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 String keepGoing="y";
		  try {
		       if(keepGoing.equals("y") || keepGoing.equals("Y")) {
		           System.out.println("enter an integer");
		           int val=sc.nextInt();
		           System.out.println("factorial of "+val+"is:" +MathUtils.factorial(val));
		           System.out.println("Another factorial (y/n)");
		           keepGoing=sc.next();}
		           }catch(IllegalArgumentException ie){
			              System.out.println(ie);
			       }
	       }
}