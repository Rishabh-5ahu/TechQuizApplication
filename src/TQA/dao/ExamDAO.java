/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.dao;

import TQA.dbutil.DBConnection;
import TQA.pojo.Exam;
import TQA.pojo.Questions;
import TQA.pojo.QuestionsStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.net.aso.q;

/**
 *
 * @author RISHABH SAHU
 */
public class ExamDAO {
    public static String getExamid()throws Exception
    {
        Connection conn= DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery("select count(*) as totalrows from Exam");
        int rowCount=0;
        if(rs.next())
        rowCount=rs.getInt(1);
        String newid="EX"+(rowCount+1);
        return newid;
    }
    public static void addExam(Exam newExam)throws SQLException
    {
    Connection conn= DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into Exam values(?,?,?)");
    ps.setString(1, newExam.getExamId());
    ps.setString(2, newExam.getLanguage());
    ps.setInt(3,newExam.getTotalQuestion());
    int ans = ps.executeUpdate();
    } 
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
    {
         Connection conn= DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select ExamId from Exam where language=?");
        ps.setString(1, subject);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examList = new ArrayList<>();
        while(rs.next())
        {
            examList.add(rs.getString(1));
        }
       return examList;
    }
    public static int getQuestionCountByExam(String ExamId)throws SQLException
    {
     Connection conn= DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from Exam where Examid=?");
       ps.setString(1, ExamId);
       ResultSet rs=ps.executeQuery();
       rs.next();
       return rs.getInt(3);
    }   
}