/*
 *@Type Test.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 08:21
 * @version
 */
package cn.zhku.easy.dto;

public class UserUpdateParam {
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

    private String username;
    private String email;
}
