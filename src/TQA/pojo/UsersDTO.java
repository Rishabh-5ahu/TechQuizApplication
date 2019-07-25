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
public class UsersDTO {
    private String UserName;
    private String Password;
    private String UserType;

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getUserType() {
        return UserType;
    }
    
}
