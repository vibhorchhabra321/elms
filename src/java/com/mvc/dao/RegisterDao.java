package com.mvc.dao;
 
import java.sql.*;
import java.lang.*;
import java.sql.SQLException;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBconnection;
import java.util.*;
 
public class RegisterDao {
 
 public String registerUser(RegisterBean registerBean)
 {
 String firstName = registerBean.getFirstName();
 String lastName = registerBean.getLastName();
 String email = registerBean.getEmail();
 String contact = registerBean.getContact();

 DBconnection db,db1;
 
String test1="hello";
String test2="word";
String test3="1";
String test4="2";
int a=14;
 try
        {   db=new DBconnection();
            db.dbconnect();
 String query = "insert into users(first_name,last_name,email,contact_no) values ('"+firstName+"','"+lastName+"','"+email+"','"+ contact+"')"; //Insert user details into the table 'USERS'
 db.pstm=db.con.prepareStatement(query);//Making use of prepared statements here to insert bunch of data
 
 

 int index=db.pstm.executeUpdate();
          if(index>=1)
            {
            return "SUCCESS"; 
            }
        }
 catch(Exception e)
            {System.out.print(e.toString());
             }
       
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
       }
 
 
 
 
 
 }
