/*
 8. Write a program to print a table of 14 in reverse order from 140.
Output:140,126,112,..14


 */

package code.Assignment3;

public class code8 {
    public static void main(String[] args) {
        int num=14;

        for(int i=10;i>=1;i--){
            System.out.print(num*i+" ");
        }
        System.out.println();
    }
    
}
