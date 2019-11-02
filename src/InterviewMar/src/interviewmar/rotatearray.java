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
public class rotatearray {
    
    static int[] rotatearray(int[] ar){
        
        int cr[]=new int[ar.length];
        cr[0]=ar[ar.length-1];
        for(int i=0;i<ar.length;i++){
            if(i<ar.length-1){
                //ar[i]=ar[i-1];
                cr[i+1]=ar[i];
                
            }
        }
        
        
        return cr;
    }
    
    public static void main(String args[]){
       int arr[]={1,2,3,4,5};
       int k=3;
       for(int i=0;i<k;i++){
           arr=rotatearray(arr);
       }
       
       for(int i:arr){
           System.out.print(i);
       }
       
       //String str="12.08.1999";
       //str=str.replace("1999","2000");
       //System.out.print(str);
       
       
    }
    
}
