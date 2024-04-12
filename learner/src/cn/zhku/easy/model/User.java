/*
 *@Type Test.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 10:21
 * @version
 */
package cn.zhku.easy.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private long id;
    private String username;
    private String password; //一般情况保存的是秘密的hash值
    private String email;
    private Date birthdate;
    private int IsActive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getIsActive() {
        return IsActive;
    }

    public void setIsActive(int isActive) {
        IsActive = isActive;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                ", IsActive=" + IsActive +
                '}';
    }
}
