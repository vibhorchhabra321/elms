//LoginDao.java
package com.mvc.dao;

import com.mvc.bean.LoginBean;
import com.mvc.util.DBconnection;
public class LoginDao {
public String authenticateUser(LoginBean loginBean)
{
String userName = loginBean.getUserName(); //Keeping user entered values in temporary variables.
String password = loginBean.getPassword();
DBconnection db;
String userNameDB = "";
String passwordDB = "";
try
{
          db=new DBconnection();
          db.dbconnect(); //establishing connection
db.stm = db.con.createStatement();//Statement is used to write queries. Read more about it.
String query = "selct email,password from users";
db.rs = db.stm.executeQuery(query); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
while(db.rs.next()) // Until next row is present otherwise it return false
{
userNameDB = db.rs.getString("userName"); //fetch the values present in database
passwordDB = db.rs.getString("password");
if(userName.equals(userNameDB) && password.equals(passwordDB))
{
return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
}
}
}
catch(Exception e)
            {System.out.print(e.toString());
             }
return "Invalid user credentials"; // Just returning appropriate message otherwise
}

}
