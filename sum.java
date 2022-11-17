import java.util.Scanner;
public class sum{
   public static void main(String[] args)
   {  
     Scanner sum = new Scanner(System.in);
     System.out.println("Print Sum");

     System.out.println("Enter the first number");
     int num1= sum.nextInt();

     System.out.println("Enter the second number");
     int num2= sum.nextInt();

     int add = num1 + num2;
     System.out.println("The Sum of two number is:" +add);
    }
}