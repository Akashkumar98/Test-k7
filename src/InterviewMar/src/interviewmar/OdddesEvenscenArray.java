/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewmar;

import java.util.Arrays;

/**
 *
 * @author Akash Kumar S
 */

public class OdddesEvenscenArray {
    public static void main(String args[]){
        int arr[]={1,3,2,4,8,6,7,5,9};
        int arr1[]=new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        int k=0;
        int m=0;
        
        System.out.println("INPUT");
        for(int i=0;i<arr.length;i++){                         //arr same
            System.out.print(i+": "+arr[i]+"; ");
        }
        System.out.println();
        
        for(int i=0;i<arr1.length;i++){                         //sort des
            for(int j=i;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                    int temp;
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        
        System.out.println();
        //System.out.println(arr1[k]);
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){                      //sort ascen
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("ARR ASC");
        for(int i=0;i<arr.length;i++){                         //printing arr srot
            System.out.print(i+": "+arr[i]+"; ");
        }
        System.out.println();
        
        System.out.println("ARR1 DES");
        for(int i=0;i<arr1.length;i++){                         //printing arr1 srot
            System.out.print(i+": "+arr1[i]+"; ");
        }
        
        
        
        //System.out.println(arr1[k]);
        int res[]=new int[arr.length];
        for(int i=0;i<res.length;i++){
            if((i%2)==0){
                //System.out.println(arr1[k]);
                res[i]=arr1[k];
                k++;
                System.out.println(res[i]+" des "+i);
            }
            else if((i%2)==1){
                res[i]=arr[m];
                m++;
                System.out.println(res[i]+" asc "+i);
            }
        }
        System.out.println("outPUT");
        for(int i:res){                         //print res
            System.out.print(i+" ");
        }
    }
    
}
