/*
 8. Write a program to check if the given number is divisible by 2,5,10 or not, if not then
print a message “Is Not Divisible By 2,5,10”.(take hardcoded values)
Input: num = 10
Output: 10 is divisible by 2,5,10
Input: num = 15
Output: 15 Is Not Divisible By 2,5,10
 */

public class code8 {
    public static void main(String[] args) {
        int num=10;

        if(num%2==0 && num%5==0 && num%10==0){
            System.out.println(num+" is divisible by 2,5,10");
        }else{
            System.out.println(num+" is not divisible by 2,5,10");
        }
    }
    
}
