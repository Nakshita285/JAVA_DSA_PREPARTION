package Section_3_Functions;

public class ReverseNumber {
    public static void main(String[] args) {
        // Question: Find the reverse of the given number.

        int number = 19872862;                 // reverse of this number: 26827891
        int reverseNumber = reverse(number);
        System.out.println("The reverse of a number:" + number + " is: "+ reverseNumber);
    }
    static int reverse(int number){
        // Approach: Remainder approach
        int reverseNumber = 0;

        int rem = 0;
        while(number > 0){
            rem = number % 10;                              // last digit of number: 2, 6;
            reverseNumber = reverseNumber * 10 + rem;       // 0*10+2=2,  2*10+6=26 ...
            number /= 10;
        }
        return reverseNumber;
    }
}
