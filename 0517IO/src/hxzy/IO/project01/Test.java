package hxzy.IO.project01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		// 输出流
		OutputStream out = null;
		File file = new File("D://test//test.txt");
		try {
			out = new FileOutputStream(file);
			// 需要一个中间的变量装载，为了打印出来
			out.write(65);
			out.write(128); // ASCII吗，只支持
			out.write(6666);
			out.write(65);
			out.write(9999);
			out.write(65);
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
