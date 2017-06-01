package hxzy.IO.duix.project02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) {
		// 输入流
		InputStream in = null;
		File file = new File("D://test//test1.txt");

		try {
			in = new FileInputStream(file);
			// ObjectOutputStream 将 Java 对象的基本数据类型和图形写入
			// ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的
			// ObjectOutputStream。
			ObjectInputStream obj = new ObjectInputStream(in);
			User str = (User) obj.readObject();
			System.out.println("String-->" + str.getName());
			System.out.println("文件写入完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
