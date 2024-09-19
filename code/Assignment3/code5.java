/*
 5. Write a program to print the odd numbers from 1 - 70.
Output:1,3,5,7,...69

 */

package code.Assignment3;

public class code5 {
    public static void main(String[] args) {
        int num=70;

        for(int i=1;i<=num;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
}
