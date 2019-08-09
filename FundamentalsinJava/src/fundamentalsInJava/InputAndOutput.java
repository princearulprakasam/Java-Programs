package fundamentalsInJava;
import java.util.*;
public class InputAndOutput {
public static void main (String arg []) {
Scanner sc = new Scanner (System.in);
System.out.println ("Input 2 values:\n");
int a=sc.nextInt();
int b=sc.nextInt();
float c=(float)a/b;
int d=a%b;
System.out.println ("Quotient"+c);
System.out.println ("Reminder"+d);
}
}
