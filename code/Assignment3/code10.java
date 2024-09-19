/*
 10. Write a program to print the product of the first 10 natural numbers.
Output: 3628800


 */

package code.Assignment3;

public class code10 {
    public static void main(String[] args) {
        int num=10;
        int product=1;

        for(int i=1;i<=num;i++){
            product*=i;
        }
        System.out.println(product);
    }
    
}
