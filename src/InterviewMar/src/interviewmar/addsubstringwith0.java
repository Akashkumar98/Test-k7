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
public class addsubstringwith0 {
    public static void main(String args[]){
        String s1="";
        String s2="";
        Scanner in=new Scanner(System.in);
        s1=in.next();
        s2=in.next();
        String r1="";
        String r2="";
        int n1,n2;
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        int res;
        res=n1+n2; 
        System.out.println(res);
        String str1="";
        String str2="";
        int i=0;
        while(i<s1.length()){
            Character ch=s1.charAt(i);
            if(ch=='0'){
                i++;
                continue;
                //s1=s1.replace('0',' ');
            }
            str1=str1+ch;
            i++;
        }
        i=0;
        while(i<s2.length()){
            Character ch=s2.charAt(i);
            if(ch=='0'){
                i++;
                continue;
                //s2=s2.replace('0',' ');
            } 
            str2=str2+ch;
            i++;
        }
        n1=Integer.parseInt(str1);
        n2=Integer.parseInt(str2);
        res=n1+n2;
        System.out.println(res);
        
    }  
}
