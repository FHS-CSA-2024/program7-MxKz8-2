//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int schruteBucks = 0;
        int klevins = 0;
        int stanleyNickels = 0;
        double decimalSchruteBucks = 0.0;
        
        System.out.println("Enter schrute-bucks: ");
        schruteBucks = myScanner.nextInt();
        
        System.out.println("Enter klevins: ");
        klevins = myScanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        stanleyNickels = myScanner.nextInt();
        
        stanleyNickels = stanleyNickels + klevins * 12;
        schruteBucks = schruteBucks + stanleyNickels/100;
        stanleyNickels = stanleyNickels%100;
        
        System.out.println("Decimal schrute-bucks = $" + schruteBucks + "." + stanleyNickels);
        
        System.out.println();
        System.out.println("This program was written by:");
        System.out.println("Kyle Tan on 9.6.24 in 1st period");
    }
}
//Paste console output below:
/*

Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = $9.13

This program was written by:
Kyle Tan on 9.6.24 in 1st period

*/
