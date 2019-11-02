
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewmar;

import java.util.Stack;

/**
 *
 * @author Akash Kumar S
 */

public class unbalancedpararn {
    public static void main(String args[]){
        String str="({a+b}(()){({})}(a*b))";
        //int paran=0,braces=0;
        //int flag1=0,flag2=0;
        Stack<Character> st = new Stack<>();
        
        /*
        for(int i=0;i<str.length();i++){
            if( str.charAt(i)=='('){
                //paran++;
            }
            if( str.charAt(i)=='{'){
                //braces++;
            }
            if( str.charAt(i)==')'){
                //paran--;
            }
            if( str.charAt(i)=='}'){
                //braces--;
            }
        }
        
        if(paran==0 && braces==0){
            //System.out.println("The Expression is valid"+str);
            flag1=1;
        }
        else {
            flag1=0;
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='*' ||str.charAt(i)=='/'){
                if((str.charAt(i-1)!='a'||str.charAt(i-1)!='b') && (str.charAt(i+1)!='a'||str.charAt(i+1)!='b')){
                      System.out.println("hello");
                      flag2=0;
                }
                else{
                    //System.out.println();
                }
            }
        }
        
        if(flag1==1&&flag2==1){
            System.out.println("VALID"+flag1+" "+flag2);
        }
        else{
            System.out.println("INVALID "+flag1+" "+flag2);
        }
        */
        
        int flag1=0;
        for(int i=0;i<str.length();i++){
            try{
            if(str.charAt(i)=='('||str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    flag1=1;            //error
                }
            }
            else if(str.charAt(i)=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                     flag1=1;          //error
                }
            }
            }catch(Exception e){
                System.out.println(e);
                 flag1=1;      
            }
        }
        int braces=0,op=0,var=0;
        if(flag1==0 && st.empty()){
            System.out.println("VALID Brace");
            braces=1;               //valid
        }
        else{
            System.out.println("INVALID brace");
            braces=0;
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='*' ||str.charAt(i)=='/'){
                if(!(str.charAt(i-1)=='a'||str.charAt(i-1)=='b') && (str.charAt(i+1)=='a'||str.charAt(i+1)=='b')){
                    op=1; 
                    //System.out.println("hello");
                }   
            }
        } 
        
        if(op==0){
            System.out.println("valid op");
        }
        else{
            System.out.println("Invalid op");
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='b'){
                if((str.charAt(i-1)=='a'||str.charAt(i-1)=='b') || (str.charAt(i+1)=='a'||str.charAt(i+1)=='b')){
                    var=1; 
                    //System.out.println("hello");
                }   
            }
        }        
        if(var==0){
            System.out.println("VAlid Var");
        }
        else{
            System.out.println("inVAlid Var");
        }
    }    
}


