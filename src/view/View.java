package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Goods;

public class View {

  JFrame frame;
  JFrame goods;
  JFrame confirm;
  JFrame finish;

  String user = "";
  String paw = "";
  String goodName = "";
  boolean isConfirm = false;

  public static void main(String[] args) {
    View v = new View();

    v.finishView();
  }

  public String[] certificationView() {
    frame = new JFrame("User Login");
    frame.setSize(350, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    frame.add(panel);

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

    frame.setVisible(true);

    loginButton.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        user = userText.getText();
        paw = passwordText.getText();
      }
    });

    while (true) {
      if (!user.equals("") && !paw.equals("")) {
        break;
      }
    }
    String[] str = { user, paw };
    return str;
  }

  public String rentView(ArrayList<Goods> items) {

    goods = new JFrame("Choose goods");

    goods.setSize(350, 200);
    goods.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    goods.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

    for (Goods i : items) {
      JButton a = new JButton(i.toString());
      a.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          goodName = a.getText();
          System.out.println(goodName);
        }
      });
      goods.add(a);
    }
    goods.setVisible(true);

    while (true) {
      if (!goodName.equals("")) {
        break;
      }
    }

    return goodName;
  }

  public boolean confirmationView(String Name) {
    // 初始化一个jframe
    confirm = new JFrame("Comfirm");

    // 初始化一个文字区域
    JTextArea textarea = new JTextArea(Name);

    // 初始化一个jlable
    JLabel emptyLable = new JLabel("產品資訊寫這邊");

    // 初始化一个panel
    JPanel panel = new JPanel();

    // 初始化一个容器
    Container container = confirm.getContentPane();

    // 初始化一个按钮
    JButton startAutoGen = new JButton("確認資料");

    // 设置布局
    startAutoGen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        isConfirm = true;
        System.out.println(goodName);
      }
    });

    // 把按钮添加到pannel
    panel.add(textarea);
    panel.add(emptyLable);
    panel.add(startAutoGen);

    // 设置关闭方式
    confirm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 把panel添加到容器
    container.add(panel);

    // 设置大小
    confirm.setSize(350, 200);

    // 设置可见性
    confirm.setVisible(true);

    while (true) {
      if (isConfirm) {
        confirm.setVisible(false);
        confirm.dispose();
        System.out.println("4564");
        break;
      }
      System.out.println("123131313");
    }
    return true;
  }

  public void finishView() {
    finish = new JFrame("Finish");

    finish.setSize(350, 200);

    JLabel label = new JLabel("完成租借");

    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    finish.add(label);

    JButton south = new JButton("離開");
    finish.add(south, BorderLayout.SOUTH);

    finish.setVisible(true);

  }

  public void dead() {

  }

}