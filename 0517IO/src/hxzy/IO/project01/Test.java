package hxzy.IO.project01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		// �����
		OutputStream out = null;
		File file = new File("D://test//test.txt");
		try {
			out = new FileOutputStream(file);
			// ��Ҫһ���м�ı���װ�أ�Ϊ�˴�ӡ����
			out.write(65);
			out.write(128); // ASCII��ֻ֧��
			out.write(6666);
			out.write(65);
			out.write(9999);
			out.write(65);
			System.out.println("д���ļ����");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
