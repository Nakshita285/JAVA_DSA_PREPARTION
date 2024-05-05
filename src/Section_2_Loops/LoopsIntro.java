package Section_2_Loops;

import java.util.Scanner;

public class LoopsIntro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Question 1: Print number from 1 to 5
        for(int i=1; i<=5;i++){
            System.out.print( i + " " );
        }
        System.out.println();

        // Question 2: Print numbers from 1 to n
        int num = scn.nextInt();
        for (int i=1; i<=num; i++){
            System.out.print(i + " ");
        }
    }
}
