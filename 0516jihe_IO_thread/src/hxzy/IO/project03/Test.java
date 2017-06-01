package hxzy.IO.project03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		// inputStream 此抽象类是表示字节输入流的所有类的超类
		InputStream in = null;
		File file = new File("D://test//test.txt");
		byte[] buffer = new byte[1024];
		try {
			// FilterInputStream 包含其他一些输入流，它将这些流用作其基本数据源，它可以直接传输数据或提供一些额外的功能
			in = new FileInputStream(file);
			// 需要一个中间的变量装载，为了打印出来

			while (in.read(buffer) != -1) {
				System.out.println("我所读的字符是：" + new String(buffer));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 逆向的操作过程，把读取到的流输出到一个系统文件
		File fileout = new File("D://test//test2.txt");
		OutputStream out = null;
		try {
			fileout.createNewFile();
			out = new FileOutputStream(fileout);
			out.write(buffer);
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
