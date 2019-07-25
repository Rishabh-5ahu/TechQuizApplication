/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.dao;

import TQA.dbutil.DBConnection;
import TQA.pojo.Questions;
import TQA.pojo.QuestionsStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author RISHABH SAHU
 */
public class QuestionDAO {
    public static void addQuestion(QuestionsStore qstore)throws SQLException
    {
        Connection conn= DBConnection.getConnection();
        ArrayList<Questions> questionList=qstore.getALLQuestions();
        PreparedStatement ps=conn.prepareStatement("insert into QUESTIONS values(?,?,?,?,?,?,?,?,?)");
        for(Questions obj:questionList){
        ps.setString(1,obj.getExamid());
        ps.setInt(2,obj.getQno());
        ps.setString(3,obj.getQuestion());
        ps.setString(4,obj.getAnswer1());
        ps.setString(5,obj.getAnswer2());
        ps.setString(6,obj.getAnswer3());
        ps.setString(7,obj.getAnswer4());
        ps.setString(8,obj.getCorrectAnswer());
        ps.setString(9,obj.getLanguage());
        ps.executeUpdate();
     }
    }
     public static ArrayList<Questions> getQuestionsByExamId(String ExamId)throws SQLException
    {
       Connection conn= DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from Questions where Examid=? order by qno");
       ps.setString(1, ExamId);
       ResultSet rs=ps.executeQuery();
       ArrayList<Questions> questionList = new ArrayList<>(); 
       while(rs.next())
       {
           Questions obj=new Questions(ExamId,rs.getInt(2),rs.getString(9),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(3));
           questionList.add(obj);
       }
       return questionList;
    }
    public static void updateQuestions(QuestionsStore qstore)throws SQLException
    {
       Connection conn= DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("update Questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where Examid=? and qno=?");
       ArrayList<Questions> questionList = qstore.getALLQuestions();
       for(Questions que:questionList){
       ps.setString(1,que.getQuestion());
       ps.setString(2,que.getAnswer1());
       ps.setString(3,que.getAnswer2());
       ps.setString(4,que.getAnswer3());
       ps.setString(5,que.getAnswer4());
       ps.setString(6,que.getCorrectAnswer());
       ps.setString(7,que.getExamid());
       ps.setInt(8,que.getQno());
       ps.executeUpdate();
       }
    }
}
