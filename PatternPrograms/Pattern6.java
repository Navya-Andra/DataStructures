/*
*
**
***
****
*****
*****
****
***
**
*
*/

import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        int n;
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int row = 2*n;
        // outer loop for number of rows
        for(row=1; row<=n;row++){
            // inner loop for number of columns
            for(int col=1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row=n+1; row<=2*n;row++){
            // inner loop for number of columns
            for(int col=row; col<=2*n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}