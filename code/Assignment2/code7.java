/*
 7. Calculate the profit or loss.
Write a program that takes cost price and selling price(take it hardcoded) and calculates its
profit or loss.
Input 1:
sellingPrice: 1200
costPrice: 1000
Output: Profit of 200
Input 2:
sellingPrice: 300
costPrice: 500
Output: loss of 200
Input 3:
sellingPrice: 900
costPrice: 900
Output: No profit no loss
 */

package code.Assignment2;

public class code7 {
    public static void main(String[] args) {
        
    
    int sellingprice=300;
    int costPrice=300;

    if(sellingprice>costPrice){

        int profit=sellingprice-costPrice;

        System.out.println("Profit of "+profit);

    }else if(sellingprice<costPrice){
        int loss=costPrice-sellingprice;

        System.out.println("Loss of "+loss);
    }else{
        System.out.println("No profit no loss");
    }
    
}

}
