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
public class palindrome {
    public static boolean pal(int num){
        int a=num;                  ///2456
        int x=0,r;
        while(a>0){
            r=a%10;
            x=x*10 + r;
            a=a/10;
        }
        if(x==num){
            return true;
        }
        return false;
        
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(pal(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
    
}
