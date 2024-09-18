/*3.Write a program to check whether the given character is a vowel or consonant.(take hard
coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant */

package code.Assignment2;

public class code3 {
    public static void main(String[] args) {
        char ch='D';

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" is vowel");
        }else{
            System.out.println(ch+" is consonant");
        }
    }
    
}
