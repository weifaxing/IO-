package hxzy.IO.project01;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test2 {
	public static void main(String[] args) {
		// ������
		InputStream in = null;
		File file = new File("D://test//test.txt");

		try {
			in = new FileInputStream(file);
			DataInputStream doc = new DataInputStream(in);
			String data = doc.readUTF();
			boolean flag = doc.readBoolean();
			double db = doc.readDouble();
			System.out.println("String-->" + data + "\t����-->" + flag + "\tdouble-->" + db);
			System.out.println("�ļ�д�����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
