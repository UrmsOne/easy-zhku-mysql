/*
 *@Type GuiDemo.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 20:29
 * @version
 */
package cn.zhku.easy.gui;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GuiDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame");
        frame.setSize(400, 300); // 设置窗口的宽度和高度
        frame.setLocationRelativeTo(null); // 将窗口居中显示
        JButton button = new JButton("Click Me");
        frame.add(button); // 将按钮添加到窗口中
        frame.setVisible(true);
    }
}
