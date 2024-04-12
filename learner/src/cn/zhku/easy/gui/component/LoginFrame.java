/*
 *@Type LoginFrame.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/12 12:25
 * @version
 */
package cn.zhku.easy.gui.component;

import cn.zhku.easy.model.User;
import cn.zhku.easy.service.UserService;
import cn.zhku.easy.service.impl.UserServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() throws Exception{
        setTitle("用户登录");
        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 将窗口居中显示

        // 创建面板和布局管理器
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // 创建用户名标签和文本框
        JLabel usernameLabel = new JLabel("用户名:");
        usernameField = new JTextField(20);
        panel.add(usernameLabel);
        panel.add(usernameField);

        // 创建密码标签和密码框
        JLabel passwordLabel = new JLabel("密码:");
        passwordField = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // 创建登录按钮并添加事件监听器
        JButton loginButton = new JButton("登录");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                UserService userService = new UserServiceImpl();
                try {
                    User user = userService.getUserByName(username);
                    // 进行用户名和密码验证，这里只是简单示例
                    System.out.println(password);
                    System.out.println(user.getPassword());
                    if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                        JOptionPane.showMessageDialog(LoginFrame.this, "登录成功");
                        // 进行登录成功后的操作，比如打开新窗口或执行其他操作
                    } else {
                        JOptionPane.showMessageDialog(LoginFrame.this, "用户名或密码错误");
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        panel.add(loginButton);

        // 将面板添加到窗口中
        add(panel);
    }

    public static void main(String[] args) throws Exception{
        // 创建登录窗口并显示
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
