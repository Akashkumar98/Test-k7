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
public class panagram {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        str = str.toLowerCase();
        str = str.replace(" ", "");
        int arr[]=new int[26];
        
        for(char c : str.toCharArray()){
            if(Character.isAlphabetic(c)){
                arr[c-'a']++;
            }
        }
        int flag=0;
        for(int c : arr){
            if(c==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.print("Panagram");
        }
        else{
            System.out.print("Not a Panagram");
        }
       
    }
    
}
