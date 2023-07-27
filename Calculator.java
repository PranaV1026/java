import java.util.Scanner;
class Calculator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println("Enter Your Choice");
         System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

        System.out.println("Enter Your Choice");
        int operation = sc.nextInt();

        if (operation == 1)
        {
            System.out.println("Addition is " + (a+b));
        }
        else if (operation == 2)
        {
            System.out.println("Subtraction is " + (a-b));
        }
        else if (operation == 3)
        {
            System.out.println("Multiplication is " + (a*b));
        }
        else if (operation == 4)
        {
            System.out.println("Division is " + (a/b));
        }
        else if (operation == 5)
        {
            System.out.println("Modulus is " + (a%b));
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}
//