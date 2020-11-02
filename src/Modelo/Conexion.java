/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    

  public Conexion(){
      
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Almacen_v1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
          System.out.println("Conectado!");
      }catch (Exception e ){
          System.out.println("Error Conexion:"+ e);
      }
  }
  
  public Connection getConnection(){
      return con;
  }
    
}
