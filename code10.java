/*
 * Write a program to print the month name according to the month number.
Input : 1
Output: January

Input: 2
Output: February
Input: 13
Output: Invalid input for months
 */


public class code10 {
    public static void main(String[] args) {
        int month=10;

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuwary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter the correct month number ");
                break;
        }
    }
    
}
