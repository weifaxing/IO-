package hxzy.IO.homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyView extends JFrame {

	private JPanel panel;
	private JButton bnt;
	private JLabel lab;

	public MyView() {
		// TODO Auto-generated constructor stub
		this.setTitle("����");
		this.setSize(450, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void prinf() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		this.add(panel);

		lab = new JLabel();
		lab.setBounds(50, 100, 250, 40);
		lab.setFont(new Font("����", Font.BOLD, 12));
		panel.add(lab);

		bnt = new JButton();
		bnt.setText("��������");
		bnt.setBounds(50, 50, 100, 40);
		bnt.setFont(new Font("����", Font.PLAIN, 12));
		bnt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File file = new File("D://test");
				File[] fs = file.listFiles();
				if (!file.exists()) {
					System.out.println("�ļ�������");
				} else {
					for (File files : fs) {
						if (files.getName().endsWith(".mp3") || files.getName().endsWith(".wma")) {
							lab.setText(files.getName());
						} else {
							lab.setText("���ļ�����������");
						}
					}
				}
			}

		});
		panel.add(bnt);
	}
}
