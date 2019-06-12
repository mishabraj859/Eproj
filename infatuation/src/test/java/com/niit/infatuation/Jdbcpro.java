package com.niit.infatuation;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;
public class Jdbcpro {
    private static String driver;

public static void main(String a[])
{
      try
          {   
              Scanner in=new Scanner(System.in);
              System.out.println("Enter the id");
              String a1=in.next();
              System.out.println(1);
              Class.forName("org.h2.Driver");
              Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/infatuation","sa","sa");
              PreparedStatement stmt = con.prepareStatement("select * from user where uid=(?)");
              stmt.setString(1,a1); 
              ResultSet rs=stmt.executeQuery();
                  while(rs.next())
                  {
                   String sp=rs.getString("uid");
                   String id=rs.getString("uname");
                  System.out.println("id="+sp+" name ="+id);
                  }
                 }  
                 
              
       
          catch(Exception e){
          System.out.println(e);
          }
        }
   
}
    
