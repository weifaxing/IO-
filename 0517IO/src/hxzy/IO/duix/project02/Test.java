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
		// �����
		OutputStream out = null;
		File file = new File("D://test//test1.txt");
		try {
			out = new FileOutputStream(file);
			// ObjectOutputStream��FileOutputStream���ֵܹ�ϵ������OutputStream�Ķ���
			ObjectOutputStream obj = new ObjectOutputStream(out);
			// ʹ�ö�����������Ҫ���л�
			User user = new User();
			user.setContent("���ǻư�ƽ");
			user.setDate(new Date());
			user.setName("��ƽ");

			obj.writeObject(user);
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
