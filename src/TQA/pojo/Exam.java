/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.pojo;

/**
 *
 * @author RISHABH SAHU
 */
public class Exam {
    private String ExamId;
    private String Language;
    private int totalQuestion;

    public String getExamId() {
        return ExamId;
    }

    public String getLanguage() {
        return Language;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public Exam(String ExamId, String Language, int totalQuestion) {
        this.ExamId = ExamId;
        this.Language = Language;
        this.totalQuestion = totalQuestion;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }
    
}
