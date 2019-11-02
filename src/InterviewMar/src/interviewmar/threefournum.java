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

public class threefournum {
    public static void main(String args[]){
        int num,var;
        Scanner in=new Scanner(System.in);
        System.out.println("ENter N");
        num=in.nextInt();
        //StringBuffer str=new StringBuffer();
        String str="";
        var=num;
        for(int i=1;i<=var+1;i++){
            num=i;
            while(num>1){
                if(num%2==0){
                    //str.append('3');
                    str="3"+str;
                }
                else{
                    //str.append('4');
                    str="4"+str;
                }
                num=num/2;
            }
            //str=str.reverse();
            System.out.print(str+" ");
            str="";
            
        }
    }
    
}
