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
public class firstProgramMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        String str="PROGRAM";
        //System.out.println(str.charAt(0));
        int k=str.length()-1;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j){                               //top left to bottom right
                    System.out.print(str.charAt(i));
                    if(i+j==str.length()-1){            //the intersection point
                        k--;
                    }
                }
                else if(i+j==str.length()-1){           //top right to bottom left
                    System.out.print(str.charAt(k));
                    k--;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
