import java.util.Scanner;
public class Quadratic {
    public static void main(string[] Strings)
     {
         Scanner input =new Scanner(System.in)
         System.out.println("enter the value of a:");
         double a=input.nextDouble();
         System.out.println("Enter the value of b:");
         double b= input.nextDouble();
         System.out.println("Enter the value of c:");
         double c= input.nextDouble();
         double d= b*b-4.0*a*c;
         if(d>0.0)
         {
              double r1=(-b+Math.sqrt(d))/(2*a);
              double r2=(-b-Math.sqrt(d))/(2*a);
              System.out.println("The roots are Real and Disctict\nRoot1="r1+"\nRoot2="+r2);
         else if(d==0.0)
         {
            double r1= -b/(2*a);
	    System.out.println("The roots are real and equal.\nRoot1="r1+"\nRoot2="+r1);
         }
         else
         {
            System.out.println("Roots are Imaginary");
          }
      }
 }