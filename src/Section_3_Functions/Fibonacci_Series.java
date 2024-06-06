package Section_3_Functions;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args){
        // Creating a Fibonacci series
        // Question: Find the nth Fibonacci number
        Scanner scn = new Scanner(System.in);
        //Step 1: with the help of temp variable
        int num = scn.nextInt();
        int ans = fibonacciFunction(num);

        System.out.println(ans);
    }
    static int fibonacciFunction(int num){
        int count = 2;
        int temp =0;
        int a = 0;      //number 1
        int b = 1;      // number 2
        // 0 1 1 2 3 5 8 13 21 ....
        while (count <= num){
            temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        return b; // answer is b.
    }
}
