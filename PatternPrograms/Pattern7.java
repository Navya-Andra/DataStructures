/*
    *
   **
  ***
 ****
*****
*/

import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        int n,space;
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // outer loop for number of rows
        for(int row=1; row<=n;row++){
            // inner loop for number of columns
            for(space=1;space<= n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}