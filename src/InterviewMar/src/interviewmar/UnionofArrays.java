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
import java.util.*;

public class UnionofArrays {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A and B n:");
        int an,bn;
        an=in.nextInt();
        bn=in.nextInt();
        int a[]=new int[an];
        int b[]=new int[bn];
        for(int i=0;i<an;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<bn;i++){
            b[i]=in.nextInt();
        }
        int res[]=new int[an+bn];
        int count=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int l=Integer.max(a.length,b.length);
        
        for(int i=0;i<an;i++){
            for(int j=i+1;j<an;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<bn;i++){
            for(int j=i+1;j<bn;j++){
                if(b[i]==b[j]){
                    b[j]=0;
                }
            }
        }
        for(int i=0; i<a.length ; i++){
            for(int j=0; j<b.length ; j++){
                if(a[i]==b[j]){
                    b[j]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                continue;
            }
            res[count]=a[i];
            count++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==0){
                continue;
            }
            res[count]=b[i];
            count++;
        }
        //Arrays.sort(res);
        
        for(int i=0;i<count;i++){
            System.out.print(res[i]+" ");
        }
        
    }
    
}
