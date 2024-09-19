/*
 9. Write a program to print the sum of the first 10 natural numbers.
Output:55

 */

package code.Assignment3;

public class code9 {
    public static void main(String[] args) {
        int num=10;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);

        //System.out.println(num*(num+1)/2);
    }
    //sum of n natural numbers is=n*(n+1)/2
    
}
