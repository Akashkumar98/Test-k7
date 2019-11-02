/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewmar;

/**
 *
 * @author Akash Kumar S
 */

import java.util.Scanner;

public class matrixspiral {
    public static void main(String args[]){
        
        int arr[][]=new int[10][10];
        int row,col,rs=0,cs=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Rows and Cols:");
        row=in.nextInt();
        col=in.nextInt();
        System.out.println("Enter the Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }
        while( rs<row && cs<col ){
            //first row
            for(int i=cs;i<col;i++){
                System.out.print(arr[rs][i]);
            }
            rs++;
            
            //last column
            for(int i=rs;i<row;i++){
                System.out.print(arr[i][col-1]);
            }
            col--;
            
            //last row
            for(int i=col-1;i>=cs;i--){
                System.out.print(arr[row-1][i]);              
            }
            row--;
            
            //first column
            for(int i=row-1;i>=rs;i--){
                System.out.print(arr[i][cs]);       
                //System.out.print("hrl");
            }
            cs++;
           
        }
        System.out.println();
        
        
        
    }   
}
