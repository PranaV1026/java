 import java.util.*;
// public class Arrays
// {
//     public static void main(String[] args) 
//     {
       
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] numbers= new int [size];
//         // Marks[0] = 10;
//         // Marks[1] = 20;
//         // Marks[2] = 30;
//         // Marks[3] = 40;
//         // Marks[4] = 50;
//         // System.out.println("Physics : " + (Marks[0]));
//         // System.out.println("Chemistry :" +(Marks[1]));
//         // System.out.println("Maths :" + (Marks[2]));
//         // System.out.println("English :" + (Marks[3]));
//         // System.out.println("Hindi :" + (Marks[4]));


//         //input
//         for(int i=0; i<=size; i++)
//         {
//             numbers[i] = sc.nextInt();
//         }

//         //output
//         for(int i=0; i<=size; i++)
//         {
//             System.out.println(numbers[i]);
//         }
//     }
// }

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int input = sc.nextInt();
        System.out.print("Enter the Search Input: ");
        int[] number = new int[input];

        // Input
        for (int i = 0; i < input; i++) { // Corrected the loop condition
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // Output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("X found at index: " + i);
                break;
            }
        }
    }
}

//take an array as a input form the user. search for a given number x and print the index at which it occurs?