/*
 9. Write a program in java to accept three numbers and check whether they are
pythagorean triplets or not.
Example:
a=3, b=4,c=5
If
a*a+b*b =c*c
Its pythagorean triplet
Else
Not a pythagorean triplet
Input:
a=3,b=4,c=5
Output : it is a pythagorean triplet
Input:
a=2,b=2,c=2
Output : it is not a pythagorean triplet
 */

package code.Assignment2;

public class code9 {
    public static void main(String[] args) {
        int a=3,b=4,c=5;

        if(a*a+b*b==c*c){
            System.out.println("it is a pythagorean triplet");
        }else{
            System.out.println("it is not a pythagorean triplet");
        }
    }
    
}
