/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TQA.pojo;

import java.util.ArrayList;

/**
 *
 * @author RISHABH SAHU
 */
public class AnswerStore {
    ArrayList<Answer> answerList;
    public AnswerStore()
    {
        answerList=new ArrayList<>();
    }
    public void addAnswer(Answer answer)
    {
    answerList.add(answer);
    }
    public Answer getAnswer(int pos) 
    {
    return answerList.get(pos);
    }
    public void removeAnswer(int pos)
    {
        answerList.remove(pos);
    }
    public  void setAnswerAt(int pos,Answer answer)
    {
    answerList.set(pos, answer);
    }
    public ArrayList<Answer> getAllAnwers()
    {
    return answerList;
    }
    public int getCount()
    {
    return answerList.size();
    }
    public Answer getAnswerByQno(int qno)
    {
        for(Answer answer:answerList)
        {
         if(answer.getQno()==qno)
         return answer;
        }
        return null;
    }
    public int removeAnswer(Answer answer)
    {
    int pos=answerList.indexOf(answer);
    answerList.remove(pos);
    return pos;
    }
}
