package hxzy.IO.duix.project02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) {
		// ������
		InputStream in = null;
		File file = new File("D://test//test1.txt");

		try {
			in = new FileInputStream(file);
			// ObjectOutputStream �� Java ����Ļ����������ͺ�ͼ��д��
			// ObjectOutputStream(OutputStream out) ����д��ָ�� OutputStream ��
			// ObjectOutputStream��
			ObjectInputStream obj = new ObjectInputStream(in);
			User str = (User) obj.readObject();
			System.out.println("String-->" + str.getName());
			System.out.println("�ļ�д�����");
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
