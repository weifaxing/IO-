package hxzy.IO.duix.project02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// 输出流
		OutputStream out = null;
		File file = new File("D://test//test1.txt");
		try {
			out = new FileOutputStream(file);
			// ObjectOutputStream和FileOutputStream是兄弟关系，都是OutputStream的儿子
			ObjectOutputStream obj = new ObjectOutputStream(out);
			// 使用对象流，必须要序列化
			User user = new User();
			user.setContent("我是黄安平");
			user.setDate(new Date());
			user.setName("安平");

			obj.writeObject(user);
			System.out.println("写入文件完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
