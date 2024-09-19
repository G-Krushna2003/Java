/*
 4. Write a program to print the even numbers from 1 - 100.
Output:2,4,6,8,10,...100

 */

package code.Assignment3;

public class code4 {
    public static void main(String[] args) {
        int num=100;

        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
}
