package hxzy.mysql.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBDAo {
	private PreparedStatement ptmt;
	private Connection conn;
	private ResultSet rs;

	public void connDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hxzy", "root", "123456");
			System.out.println("���ݿ����ӳɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object[][] selectDB() {
		Object[][] obj = null;
		connDB();
		String sql = "Select * from t_depts";

		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			// �ý�������α귵�ص�һ��
			rs.beforeFirst();
			// MetaDtaָ���Ǳ�ͷ
			ResultSetMetaData rsmd = rs.getMetaData();
			// ��ȡ���ݱ�һ���ж�����
			int lenght = rsmd.getColumnCount();
			// �����ά���鳤��
			obj = new Object[count][lenght];
			System.out.println(count + " " + lenght);
			int row = 0;
			while (rs.next()) {
				for (int i = 0; i < lenght; i++) {
					obj[row][i] = rs.getObject(i + 1);
				}
				row++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return obj;
	}

	public void closeDB() {
		if (ptmt != null) {
			try {
				ptmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public String[] ResultSetMetaDataDemo() {

		// ��ȡԪ����
		ResultSetMetaData rm;
		int cols = 0;
		String[] tableName = null;
		try {
			rm = rs.getMetaData();
			cols = rm.getColumnCount();
			for (int i = 0; i < cols; i++) {
				tableName[i] = rm.getColumnName(i + 1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ��ǰ��������

		return tableName;
	}

	public static void main(String[] args) {
		DBDAo db = new DBDAo();
		System.out.println(db.selectDB()[0][2]);
		System.out.println(db.ResultSetMetaDataDemo()[1]);
	}
}
