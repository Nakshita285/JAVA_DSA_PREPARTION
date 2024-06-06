package Section_3_Functions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            int ans = 0;
            // Layout
            System.out.println("*************************** Welcome to our Calculator ***************************");
            System.out.println();
            System.out.println("1. Add (+)\n2. Subtract (-)\n3. Multiply (*)\n4. Divide (/)\n5. Modulus (%)\n\n <<<<< Press X to exit >>>>>");
            char operator = scn.next().charAt(0);       // Give the value of char at 0th index.
            System.out.print("Enter the Number 1: ");
            int number1 = scn.nextInt();
            System.out.print("Enter the Number 2: ");
            int number2 = scn.nextInt();
            switch (operator) {
                case '1':
                case '+':
                    ans = number1 + number2;
                    System.out.println("Answer: " + ans);
                    break;
                case '2':
                case '-':
                    ans = number1 - number2;
                    System.out.println("Answer: " + ans);
                    break;
                case '3':
                case '*':
                    ans = number1 * number2;
                    System.out.println("Answer: " + ans);
                    break;
                case '4':
                case '/':
                    if (number2 != 0) {
                        ans = number1 / number2;
                        System.out.println("Answer: " + ans);
                    } else {
                        System.out.println("Cant divide by Zero.");
                    }
                    break;
                case '5':
                case '%':
                    ans = number1 % number2;
                    System.out.println("Answer: " + ans);
                    break;
                default:
                    System.out.println("You have entered wrong value!!!");
            }
            if(operator == 'x' || operator == 'X'){
                    System.out.println("Thank you for visiting us.");
                    break;
            }
        }   // end while
    }
}
