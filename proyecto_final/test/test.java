package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;
public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        CallableStatement callate=con.prepareCall("{call autenticar_usuario_1(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"system");
        callate.setString(3,"system");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El id insertado es:"+pk);
    }
  }
Crear otra java clas llamada buscar usuario
package com.jc.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestTodo {
    public static void main(String...x)throws Exception{
        System.out.println("probando usuario");
        
       for( Usuario u:usuario.buscarTodos()){
           System.out.println(u.getLogin());
       }
        
    }
}
