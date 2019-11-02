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
public class reverswithspclchar {
    public static void main(String args[]){
        String str="hello!akash,how?";
        char str1[] = str.toCharArray();
        char loc[]=new char[str1.length];
        System.out.println(str1);
        int k=0;
        for(int i=0;i<str1.length;i++){
            //Character ch=str1[i];
            if(str1[i]!='!' && str1[i]!='@' && str1[i]!=';' && str1[i]!='?' && str1[i]!='.' && str1[i]!=',' ){
                loc[k]=str1[i];
                k++;
            }
        }
        System.out.println(loc);

        String s1=loc.toString();
        String reverse = "";
        
        
        for(int i = s1.length()- 1; i >= 0; i--)
        {
            reverse = reverse + s1.charAt(i);
        }
        System.out.println(s1);
        loc=s1.toCharArray();
        System.out.println(loc);
        
        System.out.println(loc);
        k=0;
        for(int i=0;i<str.length();i++){
            //Character ch=str.charAt(i);
            if(str1[i]!='!' && str1[i]!='@' && str1[i]!=';' && str1[i]!='?' && str1[i]!='.' && str1[i]!=',' ){
               //Character x=loc.charAt(k);
               //str=str.replace(ch, x);
               //System.out.println(ch+""+x);
               str1[i]=loc[k];
               k++;
               //System.out.println("Check");
            }
            
        }
        System.out.println(str1);
    }
    
    
    
    
}
