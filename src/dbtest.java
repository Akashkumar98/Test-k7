/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Akash Kumar S
 */
public class dbtest {
    
    public static void main(String args[]){
        
        String query007="select * from root.userdata";
        String xname="akash lott";
        String xpass="sahwetha";
        String query="select * from userdata where (name=xname and pass=xpass); ";
        
        try{
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/lbm","root","akash");  
        PreparedStatement ps=con.prepareStatement(query007);      
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String jname=rs.getString(1);
            String jmail=rs.getString(3);
            String age=rs.getString(4);
           
            System.out.println(jname+"  "+jmail+"  "+age);
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
      
    }
    
    
}
