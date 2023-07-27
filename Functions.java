import java.util.*;

//public class Functions
// {
//     public static void printMyName(String name)
//     {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[]args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
//         return;
//     }

// }

// public class Functions
// {
//     public static int calculateSum(int a , int b)
//     {
//         int sum = a + b;
//         return sum;   
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
//     }
// }


//Factorial
// public class Functions
// {
//     public static void printFactorial(int n) 
//     {
//         if(n < 0){
//             System.out.println("Invalid number");
//             return;
//         }
//         int factorial = 1;
        
//         for(int i=n; i>=1; i--)
//         {
//             factorial = factorial * i;
//         }

//         System.out.println(factorial);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFactorial(n);
//     }
// }


// sum of all odd numbers 
// public class Functions{
//     public static int calculatesum(int n)
//     {
//         int sum = 0;
//         for(int i=1; i<=n; i++)
//         {
//             if(i % 2 != 0)
//             {
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int  n = sc.nextInt();

//         int result = calculatesum(n);
//         System.out.println("Sum of all odd numbers:" + n + "\nis : " + result);
//     }
// }

//sum of all even numbers
// public class Functions
// {
//     public static int calculatesum(int n)
//     {
//         int sum = 0;
//         for(int i=0; i<=n; i++)
//         {
//             if(i % 2 ==0)
//             {
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int result = calculatesum(n);
//         System.out.println("Sum of all even no in:" + n + " \n is " + result);
//     }
// }

//write a function which takes in 2 numbers and return the greater of those two?
// public class Functions
// {
//     public static int printgreaterNo(int a , int b ) 
//     {
//         if( a > b)
//         {
//             return a;        
//         }
//         else
//         {
//             return b;
//         }
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         {
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//             int result = printgreaterNo(a,b);
//             System.out.println("Largest No is:" + result);
//         }
//     }
// }

// public class Functions
// {
//     public static void printAge(int age)
//     {
//         if(age >= 18)
//         {
//             System.out.println("You are eligible to vote");
//         }
//         else{
//             System.out.println("You are not eligible to vote");
//         }
        
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print20("Enter yout Age:");
//         int age = sc.nextInt();

//         printAge(age);
//     }
// }


//write infinite loop using do while loop
public class Functions {
    public static void main(String[] args) {
        do {
            System.out.println("This is an infinite loop using a do-while loop.");
        } while (true);
    }
}