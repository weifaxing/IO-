package hxzy.manager.homework;

import java.awt.event.ItemEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Myhread extends Thread {

	private JLabel image;
	private JLabel labUser;
	private JLabel labPwd;
	private JButton bnt1;
	private JButton bnt2;
	private Object name;

	public Myhread(String name, JLabel image, JLabel labUser, JLabel labPwd, JButton bnt1, JButton bnt2) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.image = image;
		this.labUser = labUser;
		this.labPwd = labPwd;
		this.bnt1 = bnt1;
		this.bnt2 = bnt2;
	}

	public void run() {
		if (name == "English") {
			image.setIcon(new ImageIcon("images//logoen.png"));
			labUser.setText("username:");
			labPwd.setText("userpwd:");
			bnt1.setText("Login");
			bnt2.setText("Register");
			return;
		}
		if (name == "����") {
			image.setIcon(new ImageIcon("images//icon.png"));
			labUser.setText("�������û�����:");
			labPwd.setText("�������û�����:");
			bnt1.setText("�û���¼");
			bnt2.setText("�û�ע��");
			return;
		} else {
			JOptionPane.showMessageDialog(null, "��������");
			return;
		}
	}
}
