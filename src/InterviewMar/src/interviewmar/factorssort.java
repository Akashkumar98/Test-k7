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
public class factorssort {
    public static void main(String args[]){
        int a[]={8,12,10,20,25};
        int fa[]=new int[a.length];
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            fa[i]=0;
            for(int j=1;j<a[i];j++){
                if(a[i]%j==0){
                    fa[i]+=j;
                }
            }
        }
        //Arrays.sort(fa);
        //int max=fa[0];
        for(int i=0;i<fa.length;i++){
            for(int j=i;j<fa.length;j++){
                if(fa[i]<fa[j]){
                    int temp=fa[i];
                    fa[i]=fa[j];
                    fa[j]=temp;
                    
                    int temp1=a[i];
                    a[i]=a[j];
                    a[j]=temp1;
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:fa){
            System.out.print(i+" ");
        }
        
    }
    
}
