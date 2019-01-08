package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 */
public class View implements Observer {

  public static void main(String[] args) {

    JFrame frame = new JFrame("TransitionSystem");

    frame.setSize(350, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    frame.add(panel);

    view1();
    view2(panel);

    frame.setVisible(true);
  }

  private static void view1() {

    JFrame frame = new JFrame("TransitionSystem");

    frame.setSize(350, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

    frame.getContentPane().setLayout(new GridLayout(1, 2));

    JButton a = new JButton("機車租賃");
    JButton b = new JButton("圖書租借");

    frame.add(a);
    frame.add(b);

    frame.setVisible(true);

  }

  private static void view2(JPanel panel) {
    /*
     * 布局部分我们这边不多做介绍 这边设置布局为 null
     */
    panel.setLayout(null);

    // 创建 JLabel
    JLabel userLabel = new JLabel("使用者:");
    /*
     * 这个方法定义了组件的位置。 setBounds(x, y, width, height) x 和 y 指定左上角的新位置，由 width 和 height
     * 指定新的大小。
     */
    userLabel.setBounds(10, 20, 80, 25);
    panel.add(userLabel);

    /*
     * 创建文本域用于用户输入
     */
    JTextField userText = new JTextField(20);
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);

    // 输入密码的文本域
    JLabel passwordLabel = new JLabel("密碼:");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);

    /*
     * 这个类似用于输入的文本域 但是输入的信息会以点号代替，用于包含密码的安全性
     */
    JPasswordField passwordText = new JPasswordField(20);
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);

    // 创建登录按钮
    JButton loginButton = new JButton("登入");
    loginButton.setBounds(10, 80, 80, 25);
    panel.add(loginButton);

  }

  private static void view3() {
  }

  public void display() {

  }

  @Override
  public void update(Observable o, Object arg) {
    // TODO Auto-generated method stub

  }

}