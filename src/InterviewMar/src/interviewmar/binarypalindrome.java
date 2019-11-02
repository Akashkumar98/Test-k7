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
public class binarypalindrome {
    public static void main(String args[]){
        int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        String str="";
        int temp;
        while(num>0){
            temp=num%2;
            if(temp==0){
                str='0'+str;
            }
            else{
                str="1"+str;
            }
            num=num/2;
        }
        System.out.println(str);
        while(str.length()%4!=0){
            str="0"+str;
        }
        System.out.println(str);
        int flag=0,j=str.length()-1;
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)!=str.charAt(j)){
                    flag=1;
             }
             j--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.print("Nah, not a palindrome");
        }
    }
    
}
