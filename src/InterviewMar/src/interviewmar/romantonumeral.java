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



public class romantonumeral {
    
    static int getValue(Character ak){
        switch (ak) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            default:
                break;
        }
        
        return -1;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int res=0;
        String str=new String();
        System.out.println("Input: ");
        str=in.next();
        if(str.length()==1){                    //for one string var
            int s1=getValue(str.charAt(0));
            res=s1;
        }
        else{                                   //for more tha one strings
            for(int i=0;i<str.length();i++){
                int s1= getValue(str.charAt(i));
                int s2= getValue(str.charAt(i+1));
                    
                if(s1<s2){
                    res=res+s2-s1;
                    i++;
                    System.out.println("Check2");
                }
                else if(s1>=s2){
                    res=res+s1;
                    System.out.println("Check1");
                }
                if(i+1==str.length()-1){
                    break;
                }
                
            }
        }
        System.out.println("Output: "+res);
    }    
}
