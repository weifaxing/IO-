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
		// inputStream �˳������Ǳ�ʾ�ֽ���������������ĳ���
		InputStream in = null;
		File file = new File("D://test//test.txt");
		byte[] buffer = new byte[1024];
		try {
			// FilterInputStream ��������һЩ��������������Щ���������������Դ��������ֱ�Ӵ������ݻ��ṩһЩ����Ĺ���
			in = new FileInputStream(file);
			// ��Ҫһ���м�ı���װ�أ�Ϊ�˴�ӡ����

			while (in.read(buffer) != -1) {
				System.out.println("���������ַ��ǣ�" + new String(buffer));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ����Ĳ������̣��Ѷ�ȡ�����������һ��ϵͳ�ļ�
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
