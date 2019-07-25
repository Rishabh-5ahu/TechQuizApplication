/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.dao;

import TQA.dbutil.DBConnection;
import TQA.pojo.Performance;
import TQA.pojo.StudentScore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RISHABH SAHU
 */
public class PerformanceDAO {
    public static ArrayList<String> getAllStudentId()throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs= st.executeQuery("select distinct userid from performance");
   ArrayList<String> studentidList=new ArrayList<String>();
    while(rs.next())
  {
  studentidList.add(rs.getString(1));
  }
  return studentidList;
   }
    public static ArrayList<String> getAllExamId(String userid)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select examid from performance where userid=?");
    ps.setString(1,userid);
    ResultSet rs=ps.executeQuery();
    ArrayList<String> examidList=new ArrayList<String>();
    while(rs.next())
  {
  examidList.add(rs.getString(1));
  }
  return examidList;
    }
    public static StudentScore getScore(String userid,String examid)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select per,language from performance where userid=? and examid=?");
     ps.setString(1,userid);
     ps.setString(2, examid);
     ResultSet rs=ps.executeQuery();
     rs.next();
     StudentScore ss=new StudentScore();
     ss.setPer(rs.getDouble(1));
     ss.setLanguage(rs.getString(2));
     return ss;
    }
    public static ArrayList<Performance> getAllData()throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    Statement ps=conn.createStatement();
    ResultSet rs=ps.executeQuery("select * from performance");
    ArrayList<Performance> List=new ArrayList<Performance>();
    while(rs.next())
     {
         String userid=rs.getString(1);
         String examid=rs.getString(2);
         int right=rs.getInt(3);
         int wrong=rs.getInt(4);
         int un=rs.getInt(5);
         double per=rs.getDouble(6);
         String language=rs.getString(7);
         Performance obj =new Performance(userid,examid,right,wrong,un,per,language);
         List.add(obj);
     }
    return List;
    }
    public static void addPerformance(Performance obj)throws SQLException
    {
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into Performance values(?,?,?,?,?,?,?)");
        ps.setString(2,obj.getExamid());
        ps.setString(1,obj.getUserid());
        ps.setInt(3,obj.getRight());
        ps.setInt(4,obj.getWrong());
        ps.setInt(5,obj.getUnattempted());
        ps.setDouble(6,obj.getPer());
        ps.setString(7,obj.getLanguage());
        int ans=ps.executeUpdate();
    }
}
