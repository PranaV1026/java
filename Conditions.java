import java.util.*;

public class Conditions
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // int height = sc.nextInt();
        
        // if(age >= 18 && height <=5)
        // {
        //     System.out.println("You are eligible to vote"); 
        // }
        // else
        // {
        //     System.out.println("You are not eligible to vote");
        // }
        
        //even odd
        // if(age % 2 == 0)
        // {
        //     System.out.println("Your are an even number");
        // }
        // else{
        //     System.out.println("Your are an odd number");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if( a == b)
        // {
        //     System.out.println("a is equal to b");
        // }
        // else if(a > b)
        // {
        //     System.out.println("a is greater than b");
        // }
        // else
        // {
        //     System.out.println("a is less than b");
        // }
        

        int Button = sc.nextInt();
        

        // if ( Button == 1)
        // {
        //     System.out.println("Hello");
        // }
        // else if (Button == 2)
        // {
        //     System.out.println("Namaste");
        // }
        // else if(Button == 3)
        // {
        //     System.out.println("Bonjour ");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }

        switch (Button)
        {
            case 1:
                System.out.println("Hello");
                break;
            
            case 2:
                System.out.println("namaste");
                break;
                
            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid Button");
        }
        
    }
}