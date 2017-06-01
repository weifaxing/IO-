package hxzy.mysql.homework;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MyView extends JFrame {
	DBDAo db = new DBDAo();
	private JPanel panel;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;

	public MyView() {
		// TODO Auto-generated constructor stub
		this.setTitle("数据表");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void printf() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

		table = new JTable(model);
		scroll = new JScrollPane(table);
		scroll.setBounds(30, 30, 400, 400);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel.add(scroll);

		Vector head = null;

		model = new DefaultTableModel(5, 10);
		model.addColumn("123");
		Object[][] data = db.selectDB();
		System.out.println("-->" + data[0][2]);

		model.addRow(data[0]);
		// 更新信息表
		table.invalidate();

	}
}
