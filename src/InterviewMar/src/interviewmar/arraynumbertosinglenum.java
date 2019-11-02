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

public class arraynumbertosinglenum {
    
    public static int getNumber(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int t=arr[i];
            total=t + total*10;
            
        }
        return total;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{2,6,5},{9,8,5}};
        int total[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            total[i]=getNumber(arr[i]);
            System.out.println(total[i]);
        }
        
        
    }
    
}
