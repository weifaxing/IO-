package hxzy.manager.homework;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDao {
	void connDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hxzy","root","123456");
			System.out.println("数据库连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DBDao db=new DBDao();
		db.connDB();
	}
}
