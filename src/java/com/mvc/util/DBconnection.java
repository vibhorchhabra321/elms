/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.util;


import java.sql.*;
/**
 *
 * @author Administrator
 */
public class DBconnection {
    public Connection con;
    public ResultSet rs,rs1,rs2;
    public Statement stm,stm1;
    public PreparedStatement pstm;

    public void dbconnect() throws Exception
    {Class.forName("oracle.jdbc.OracleDriver");
     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:elms","system","123456");
     stm=con.createStatement();
    }
    
}