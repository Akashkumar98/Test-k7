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

public class marixOX {
    public static void main(String args[]){
        int r,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter row and cols:");
        r=in.nextInt();
        c=in.nextInt();
        int row=r,col=c,rs=0,cs=0;
        String arr[][]=new String[r][c];
        int var=0;
        while(row>rs && col>cs){
            for(int i=cs;i<col;i++){                  //first row
                if(var%2==0){
                    arr[rs][i]="X";
                }
                else{
                    arr[rs][i]="O";
                }
                
                //System.out.print("X");
            }
            rs++;
            
            for(int i=rs;i<row;i++){                //last col
                if(var%2==0){
                    arr[i][col-1]="X";
                }
                else{
                    arr[i][col-1]="O";
                }
                
                
                //System.out.print("X");
            }
            col--;
            
            for(int i=col-1;i>=cs;i--){             //last row
                if(var%2==0){
                    arr[row-1][i]="X";
                }
                else{
                    arr[row-1][i]="O";
                }
                
                //System.out.print("X");
            }
            row--;
            
            for(int i=row-1;i>=rs;i--){             //first col
                if(var%2==0){
                    arr[i][cs]="X";
                }
                else{
                    arr[i][cs]="O";
                }
                
                //System.out.print("X");
            }
            cs++;
            var++;
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
