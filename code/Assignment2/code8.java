/*
 8. Write a program to check whether the student passed with:
first class with distinction, first class, second class, pass and fail according to his percent
grades. (You have to adjust range by your own for first class, second class and for pass)
Input 1: percent= 85.00
Output: Passed : first class with distinction
Input 2: percent=75.00
Output: Passed : first class with distinction
Input 3: percent=60.00
Output: Passed : first class

Input 4: percent=54.00
Output: Passed : second class
Input: percent=47
Output: Pass
 */
package code.Assignment2;

public class code8 {
    public static void main(String[] args) {
        double per=65.00;

        if(per>=75.00){
            System.out.println("Passed : first class with distinction");
        }else if(per>=60.00){
            System.out.println("Passed : first class");
        }else if(per>=50.00){
            System.out.println("Passed : second class");
        }else if(per>=35.00){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    
}
