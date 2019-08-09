package fundamentalsInJava;
import java.util.*;
public class OperatorsInJava {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Input two values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	float c=(float)a/b;
	System.out.println("The division of two numbers is"+c);
	int d=a%b;
	System.out.println("The division of two numbers is"+d);
	}
}