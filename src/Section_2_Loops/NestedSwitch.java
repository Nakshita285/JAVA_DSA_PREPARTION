package Section_2_Loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String thanksMessage = "Thanks for contacting: ";
        // take input Emp no and department
        System.out.print("Enter the department details: ");
        String department = scn.next();
        System.out.print("Enter you employee ID: ");
        int empNo = scn.nextInt();

// New switch to make the code clean.
        switch (empNo) {
            case 1 -> System.out.println("Nakshita Malhotra");
            case 2 -> System.out.println("Shivaay Singh Oberoi");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println(thanksMessage + "IT Department");
                    case "HR" -> System.out.println(thanksMessage + "HR department");
                    case "Finance" -> System.out.println(thanksMessage + "Financial Department");
                    default -> System.out.println("OOPS no department found!");
                }
            }
            default -> System.out.println("Enter the correct details");
        }
    }
}
