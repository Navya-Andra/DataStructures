/*
 *****
  ****
   ***
    **
     *
*/

import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        int n,space;
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // outer loop for number of rows
        for(int row=1; row<=n;row++){
            // inner loop for number of columns
            for(space=0; space < row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}