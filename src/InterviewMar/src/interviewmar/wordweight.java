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

public class wordweight {

    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int arr[]= new int[5];
        int arrwe[]= new int[5];
        //int arrdiv46[]= new int[5];
        
        System.out.println("Enter the Numbers: ");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<5;i++){
            arrwe[i]=0;
            for(int j=0;j<arr[i];j++){
                if(j*j==arr[i]){
                    arrwe[i]=arrwe[i]+5;
                }
            }   
            if(arr[i]%4==0 && arr[i]%6==0){
                arrwe[i]=arrwe[i]+4;
            }
            if(arr[i]%2==0){
                arrwe[i]=arrwe[i]+2;
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("Weight of "+arr[i]+" is: "+arrwe[i]);
        }
        
    }
    
    
}
