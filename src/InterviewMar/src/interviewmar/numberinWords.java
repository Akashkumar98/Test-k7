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

public class numberinWords {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        int num=in.nextInt();
        int num1=num;
        String str="";
        String temp="";
        int r;
        if(num>0){
            r=num%10;
            switch (r) {
                case 1:
                    temp=" one";
                    break;
                case 2:
                    temp=" two1";
                    break;
                case 3:
                    temp=" three";
                    break;
                case 4:
                    temp=" four";
                    break;
                case 5:
                    temp=" five";
                    break;
                default:
                    break;
            }
            str=str+temp;
            
            if(num1>10){
                temp="";
                num=num/10;
                r=num%10;
                switch (r) {
                    case 1:
                        if("  one".equals(str)){
                            str="ELeven";
                        }
                        else if(str==" two"){
                            str="Twelve";
                        }
                        else if(str==" three"){
                            str="Thirteen";
                        }   break;
                    case 2:
                        temp=" twenty";
                        break;
                    case 3:
                        temp=" thirty";
                        break;
                    case 4:
                        temp=" forty";
                        break;
                    case 5:
                        temp="fivty";
                        break;
                    default:
                        break;
                }
                str=temp+str;
                
                if(num1>100){
                    num=num/10;
                    r=num%10;

                    if(r==1){
                        temp="one hundred and";
                    }
                    else if(r==2){
                        temp="two hundred and";
                    }
                    else if(r==3){
                        temp="three hundred and";
                    }
                    else if(r==4){
                        temp="four hundred and";
                    }
                    else if(r==5){
                        temp="five hundred and";
                    }
                    str=temp+str;
                }
                
            }
        }
        
        System.out.println(str);

    }
    
}
