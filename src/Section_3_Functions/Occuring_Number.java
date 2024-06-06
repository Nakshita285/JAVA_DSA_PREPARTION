package Section_3_Functions;

public class Occuring_Number {
    public static void main(String[] args){
        // Question: Count the number of 7's in given number
        int number = 18989;
        int ans = fun(number);
        System.out.println("The number of 7's: " + ans);
    }
    // number: 18972787
    static int fun(int number){
        int rem = 0;
        int count = 0;
        while(number > 0){
            rem = number % 10;      // last digit 7
            if(rem == 7){
                count++;
            }
            number = number / 10;   // new number : 1897278 (7)
        }
        return count;
    }
}
