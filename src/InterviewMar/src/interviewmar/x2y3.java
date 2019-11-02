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

public class x2y3 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str;
        str=in.next();
        String op;
        int count=0;
        int digit[]=new int[str.length()];
        
        for(int i=0;i<str.length();i++){
            Character x=str.charAt(i);
            String y=x.toString();
            if(Character.isAlphabetic(x)){
                continue;
            }
            else{
                digit[count] = Integer.parseInt(y);
                        //Character.getNumericValue(x);
                System.out.println(digit[count]+""+count);
               
                count++;
            }
        }
        int k=0;
        //System.out.println(digit[count-1]);
        for(int i=0;i<str.length();i++){
            Character x=str.charAt(i);
            
            if(Character.isAlphabetic(x)){
                for(int j=0;j<digit[k];j++){
                    System.out.print(x);
                }
                k++;
            }
        }
        
        
        
    }
    
}
