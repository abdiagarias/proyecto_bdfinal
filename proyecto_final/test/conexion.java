
    
    package com.jc.model;
    
import java.sql.*;
public class conexion {
   
    public Connection conectarse()throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:XE";
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection(url,"system","system");
       return con;
    }
    } 

    

