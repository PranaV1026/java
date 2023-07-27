import java.util.*;


//Print the Pattern

// public class Patterns
// {
//     public static void main(String[] args)
//      {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Print the Pattern
// *****
// *   *
// *   *
// *****

// public class Patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         for( int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=m;j++)
//             {
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

        
//     }


//pattern 
// *
// **
// ***
// ****

// public class Patterns
// {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//pattern
// ****
// ***
// **
// *
// public class Patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         {
//             int n = sc.nextInt();

//             for(int i=n; i>=1; i--)
//             {
//                 for(int j=1; j<=i; j++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println(" ");
//             }
            
//         }
//     }
// }

//pattern
//    *
//   **
//  ***
// ****
// public class Patterns
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//pattern
// 1
// 12
// 123
// 1234
// 12345

// public class Patterns
// {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//pattern
//1
//0 1
//1 0 1 
//0 1 0 1
//1 0 1 0 1

public class Patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                int sum = i + j;
                if(sum % 2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

