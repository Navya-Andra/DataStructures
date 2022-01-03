/*
*
**
***
****
*****
*/

import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        int n;
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // outer loop for number of rows
        for(int row=1; row<=n;row++){
            // inner loop for number of columns
            for(int col=1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}