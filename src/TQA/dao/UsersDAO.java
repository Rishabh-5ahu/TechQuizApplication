/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.dao;

import TQA.dbutil.DBConnection;
import TQA.pojo.UsersDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RISHABH SAHU
 */
public class UsersDAO {
    public static boolean validateUser(UsersDTO obj)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select * from Users where USERID=? and PASSWORD=? and USERTYPE=?");
    ps.setString(1,obj.getUserName());
    ps.setString(2,obj.getPassword());
    ps.setString(3,obj.getUserType());
    ResultSet rs = ps.executeQuery();
    if(rs.next())
    return true;
    else
    return false;
    }
    public static boolean addUser(UsersDTO obj)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select userid from Users where userid=?");
    ps.setString(1,obj.getUserName()); 
    ResultSet rs=ps.executeQuery();
    boolean status=true;
    if(rs.next())
        status=false;
    else
    {   
    ps=conn.prepareStatement("insert into Users values(?,?,?)");
    ps.setString(1,obj.getUserName());
    ps.setString(2,obj.getPassword());
    ps.setString(3,obj.getUserType());
    ps.executeUpdate();
    }
    return status;
    }
    public static boolean changePassword(UsersDTO obj)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("update Users set password=? where userid=? and usertype=?");
    ps.setString(1,obj.getPassword());
    ps.setString(2,obj.getUserName());
    ps.setString(3,obj.getUserType());
    int ans= ps.executeUpdate();
    if(ans!=0)
        return true;
    else 
       return false;
    }
}
