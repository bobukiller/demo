package game;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame (){
        // 设置界面的大小
        this.setSize(488,430);
        // 设置界面的标题
        this.setTitle("拼图游戏-登录界面");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置界面的显示
        this.setVisible(true);
    }
}
