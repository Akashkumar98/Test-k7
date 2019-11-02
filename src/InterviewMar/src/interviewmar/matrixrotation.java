/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewmar;

import java.util.Scanner;

/*
 * @author Akash Kumar S
 */

public class matrixrotation {
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int res[][]=new int[3][3];
        res[1][1]=arr[1][1];
        int row=3,col=3,rs=0,cs=0;
        while( rs<=row && cs<=col ){
            
            //first row
            for(int i=cs;i<col-1;i++){
                //System.out.print(arr[rs][i]);     
                res[rs][i+1]=arr[rs][i];            //includes 0 from rows                
            }
            rs++;

            //last column
            for(int i=rs-1;i<row-1;i++){
                //System.out.print(arr[i][col-1]);
                res[i+1][col-1]=arr[i][col-1];                
            }
            col--;
            
            //last row
            for(int i=col;i>cs;i--){
                //System.out.print(arr[row-1][i]);
                res[row-1][i-1]=arr[row-1][i];
                
            }
            row--;            
            
            //first column
            for(int i=row;i>=rs;i--){
                //System.out.print(arr[i][cs]);       
                res[i-1][cs]=arr[i][cs];
            }
            cs++;
            
        }
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
            
    }
}
