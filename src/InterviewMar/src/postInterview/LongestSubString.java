/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postInterview;

/**
 *
 * @author Akash Kumar S
 */
public class LongestSubString 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        int count=0,max=0;
        String sub="";
        for(int i=0;i<s.length();i++)
        {
            Boolean isRepeating=false;
            int index=0;
            Character ch=s.charAt(i);
            for(int j=0;j<sub.length();j++)
            {
                if((!sub.isEmpty())&&sub.charAt(j)==ch)
                {
                    isRepeating=true;
                    index=j+1;
                    break;
                }
            }
            if(isRepeating==true)
            {
                sub=sub.substring(index);
                sub=sub.concat(ch.toString());
                count=0;
                count++;
            }
            else
            {
                sub=sub.concat(ch.toString());
                System.out.println(sub);
                count++;
                if(count>=max){
                    max++;
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        String str="pwwkewakashkumaraaa";
        int count=lengthOfLongestSubstring(str);
        System.out.println(count);
    }
}
