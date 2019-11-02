/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 Well I hope this program doesn't suck.
 * @author Akash Kumar S
 */
public class handcricket {
    public static int t1=0,t2=0,i,j,ch,v1,v2,toss,ut,ct;

    public static void main(String args[]){
        
        
        System.out.println("Welcome to Digital Hand Cricket:\n");
        Scanner in=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Select 1.Odd 2.Even:");
        toss=in.nextInt();
        System.out.println("Enter a number for toss:");
        ut=in.nextInt();
        ct=r.nextInt(10);
        switch(toss)
        {
            case 1:
                if(2%(ut+ct)==0){
                    System.out.println("CPU Toss Value:"+ct);
                    System.out.println("Sum is Even --> "+(ut+ct));
                    System.out.println("You Selected Odd :(");
                    System.out.println("You lost the toss.");
                    ch=1+r.nextInt(2);
                    if(ch==1){
                        System.out.println("CPU chose to Bowl");
                    }
                    else{
                        System.out.println("CPU chose to Bat");
                    }
                }
                else{
                    System.out.println("CPU Toss Value:"+ct);
                    System.out.println("Sum is Odd --> "+(ut+ct));
                    System.out.println("You Selected Odd.");
                    System.out.print("You won the Toss! \n Select 1.Bat 2.Bowl:");
                    ch=in.nextInt();                    
                }
                break;
            case 2:
                if(2%(ut+ct)==0){
                    System.out.println("CPU Toss Value:"+ct);
                    System.out.println("Sum is Even --> "+(ut+ct));
                    System.out.println("You Selected Even.");
                    System.out.print("You won the Toss! \n Select 1.Bat 2.Bowl:");
                    ch=in.nextInt();                   
                }
                else{
                    System.out.println("CPU Toss Value:"+ct);
                    System.out.println("Sum is Odd --> "+(ut+ct));
                    System.out.println("You Selected Even :(");
                    System.out.println("You lost the toss.");
                    ch=1+r.nextInt(2);
                    if(ch==1){
                        System.out.println("CPU chose to Bowl");
                    }
                    else{
                        System.out.println("CPU chose to Bat");
                    }
                    
                }
        }
               
        System.out.println("**Enter value from 0 to 6**\n");
        
        if(ch==1){
            System.out.println("<<FIRST INNINGS>>");
            t2=1000000;
            bat();
            t2=0;
            System.out.println("<<SECOND INNINGS>>");
            System.out.println("\nScore to Defend:"+t1);
            bowl();
        }
        else{
            
            System.out.println("<<FIRST INNINGS>>");
            t1=1000000;
            bowl();
            t1=0;
            System.out.println("<<SECOND INNINGS>>");
            System.out.println("\nScore to Chase:"+t2);
            bat();
        }
        
        
        if(t1>t2){
            System.out.println("You Won the match :D ");
        }
        else{
            System.out.println("You Lost the match _|_ ");
        }
        
      
    }
    
    public static void bat(){
        
         Scanner in=new Scanner(System.in);
         Random r=new Random();
         
        do{
            
            System.out.print("Your Bat:");
            v1=in.nextInt();
            v2=r.nextInt(7);
            System.out.println("CPU Bowl:"+v2);
            if(v1==v2){
                System.out.println("\nOops!OUT\n");
                break;
            }
            else{
                t1+=v1;
                System.out.println("Runs Scored:"+t1);
            }    
        }while(t1<=t2);
        
    }
    
    public static void bowl(){
        
         Scanner in=new Scanner(System.in);
         Random r=new Random();
         
        do{
            
            System.out.print("Your Bowl:");
            v1=in.nextInt();
            v2=r.nextInt(7);
            System.out.println("CPU Bat:"+v2);
            if(v1==v2){
                System.out.println("\nIt's WICKET!!\n");
                break;
            }
            else{
                t2+=v2;
                System.out.println("Runs Scored:"+t2);
            }    
        }while(t2<=t1);
        
    }
    
}
