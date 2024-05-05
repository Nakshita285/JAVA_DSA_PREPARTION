package Section_2_Loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //Question: Find the largest number

        // Note: Give the maximum value for 3 numbers with Math.max()
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Max: "+ max);
    /*
        1. Assume num1 is largest
            -> check with num2 and num3

        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("Max: " + max);
*/
        //Give the maximum value for 2 numbers
        //int max = Math.max(num1, num2);

    }
}
