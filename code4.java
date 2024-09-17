/*
 Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A’;
Output: A is an UPPERCASE character
 */

public class code4 {
    public static void main(String[] args) {
        char ch='z';
        if(ch>64 && ch<91){
            System.out.println("Upper case character");

        }else if(ch>96 && 124>ch){
            System.out.println("lower case charcter");
        }
    }
    
}
