/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH SAHU
 */
public class DBConnection {
     private static Connection conn;
    static
      {
        try{
    Class.forName("oracle.jdbc.OracleDriver");         
    conn=DriverManager.getConnection("jdbc:oracle:thin:@//RISHABH:1521/XE","project","java");  
       JOptionPane.showMessageDialog(null,"Connection Estiblish Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,"Connection Fail(SQLException) "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
        JOptionPane.showMessageDialog(null,"Connection Fail(ClassNotFound) "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
       }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        if(conn!=null)
       {
	try
	{
	conn.close();   
        JOptionPane.showMessageDialog(null,"Connection Close Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
	}
        catch(SQLException ex)
	{
            JOptionPane.showMessageDialog(null,"Connection doesn't Close","Error",JOptionPane.ERROR_MESSAGE);
	}
   }
 }
}
    














