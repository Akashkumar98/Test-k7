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
public class stackexample {
    public static void main(String args[]){
        Stack<Character> st=new Stack();
        
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('b');
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.elementAt(0));
        
        
    }
    
}
