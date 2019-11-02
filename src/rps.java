/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Akash Kumar S
 */
public class rps {
    public static void main(String args[])
    {
        int ch,rv,res;
        Random obj=new Random();
        System.out.println("Welcome to Rock Paper Scissor:");
        Scanner in=new Scanner(System.in);
        do
        {    
        System.out.println("Enter Value: 1.Rock 2.Paper 3.Scissor 4.Quit :");
        ch=in.nextInt();
        rv=obj.nextInt(3)+1;
        if(ch==1 && rv==1){
             System.out.println("CPU: You're Rock");
             System.out.println("CPU: Iam Rock");
             System.out.println("Its a draw..");
        }
        else if(ch==1 && rv==2){
             System.out.println("CPU: You're Rock");
             System.out.println("CPU: Iam Paper");
             System.out.println("YOU LOSE!_|_ ");
        }
        else if(ch==1 && rv==3){
             System.out.println("CPU: You're Rock");
             System.out.println("CPU: Iam Scissor");
             System.out.println("YOU WIN :D");
        }
        else if(ch==2 && rv==1){
             System.out.println("CPU: You're Paper");
             System.out.println("CPU: Iam Rock");
             System.out.println("YOU WIN :D");
        }
        else if(ch==2 && rv==2){
             System.out.println("CPU: You're Paper");
             System.out.println("CPU: Iam Paper");
             System.out.println("Its a draw..");
        }
        else if(ch==2 && rv==3){
             System.out.println("CPU: You're Paper");
             System.out.println("CPU: Iam Scissor");
             System.out.println("YOU LOSE! _|_");
        }
        else if(ch==3 && rv==1){
             System.out.println("CPU: You're Scissor");
             System.out.println("CPU: Iam Rock");
             System.out.println("YOU LOSE! _|_");
        }
        else if(ch==3 && rv==2){
             System.out.println("CPU: You're Scissor");
             System.out.println("CPU: Iam Paper");
             System.out.println("YOU WIN :D");
        }
        else if(ch==3 && rv==3){
             System.out.println("CPU: You're Scissor");
             System.out.println("CPU: Iam Scissor");
             System.out.println("Its a draw..");
        }
        else {
            System.out.println("Error in the input value!");
            break;
        }
        }while(ch!=4);
    }
    
}
