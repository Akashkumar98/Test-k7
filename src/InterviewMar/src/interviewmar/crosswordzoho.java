/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewmar;

import java.util.List;

/**
 *
 * @author Akash Kumar S
 */
public class crosswordzoho {
    public static void main(String args[]){
        String str="WELCOMETOZOHOCORPORATION";
        //List <string>zoho[10][10]=new List<string>;
        Character zoho[][]=new Character[5][5];
        String subarr[][]=new String[5][5];
        int k=0;
        String temp = "";
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                
                if(k<str.length()){
                    char c;
                    zoho[i][j]=str.charAt(k);
                    //temp = new String(zoho[][0]);
                    System.out.print(str.charAt(k));
                    k++;
                }   
            }
            System.out.println();
            
        }
        
        
        
        
        
    }
    
}
