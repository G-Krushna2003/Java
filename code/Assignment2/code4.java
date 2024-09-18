/*
 * 4. A student has passed his 12 th standard exam he thinks he might get marks upto 85
percent. Suggest the better career field depending upon the marks assumption.(take
hardcoded values)
Input 1: percentage >85.00;
Output: Medical
Input 2: percentage <=85.00 and percentage >75.00;
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00;
Output: pharmacy or bachelor in science;
 */

package code.Assignment2;

public class code4 {
    public static void main(String[] args) {
        double per=60.00;

        if(per>85.00){
            System.out.println("Medical");
        }else if(per>=85.00 || per>75.00){
            System.out.println("Engineering");
        }else if(per>=75.00 || per>=65.00){
            System.out.println("Pharmacy and bachelor of science");
        }else{
            System.out.println("no allotment");
        }
    }
    
}
