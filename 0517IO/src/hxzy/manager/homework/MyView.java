package hxzy.manager.homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyView extends JFrame {

	private JComboBox<String> cmLanguage;
	private JLabel image;
	private JPanel panel;
	private JButton bnt1;
	private JButton bnt2;
	private JLabel labUser;
	private JLabel labPwd;
	private JTextField fieldUser;
	private JPasswordField fieldPwd;

	public MyView() {
		// TODO Auto-generated constructor stub
		this.setTitle("登陆界面");
		this.setSize(350, 380);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void loginView() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

		cmLanguage = new JComboBox<String>();
		cmLanguage.setBounds(10, 30, 130, 30);
		cmLanguage.addItem("中文");
		cmLanguage.addItem("English");
		cmLanguage.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String name = (String) e.getItem();
					new Myhread(name, image, labUser, labPwd, bnt1, bnt2).start();
				}
			}
		});

		panel.add(cmLanguage);

		image = new JLabel();
		image.setBounds(150, 50, 250, 100);
		image.setIcon(new ImageIcon("images//icon.png"));
		panel.add(image);

		labUser = new JLabel();
		labUser.setText("请输入用户姓名：");
		labUser.setBounds(30, 150, 150, 30);
		panel.add(labUser);

		labPwd = new JLabel();
		labPwd.setText("请输入用户密码：");
		labPwd.setBounds(30, 200, 150, 30);
		panel.add(labPwd);

		fieldUser = new JTextField();
		fieldUser.setBounds(130, 150, 150, 30);
		panel.add(fieldUser);

		fieldPwd = new JPasswordField();
		fieldPwd.setBounds(130, 200, 150, 30);
		panel.add(fieldPwd);

		bnt1 = new JButton();
		bnt1.setText("用户登录");
		bnt1.setBounds(50, 250, 100, 30);
		panel.add(bnt1);

		bnt2 = new JButton();
		bnt2.setText("用户注册");
		bnt2.setBounds(170, 250, 100, 30);
		panel.add(bnt2);

	}

	public static void main(String[] args) {
		MyView view = new MyView();
		view.loginView();
	}
}
