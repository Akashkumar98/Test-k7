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

public class Cyclicnumbergen {
    public static int countdigits(int number){
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num;
        num=in.nextInt();
        int r,d,n,number=num;
        
        do{
            //number=num;
            System.out.println(number);
            n=countdigits(num);
            r=number%10;
            d=number/10;
            number=(int) (Math.pow(10, n-1)*r +d);
            //num=num/10;
        }while(number!=num);
        //int p= (int)('b'-'a');
        //System.out.print(p+"Check");
    }
    
}
