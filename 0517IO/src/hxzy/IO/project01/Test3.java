package hxzy.IO.project01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test3 {
	public static void main(String[] args) {
		// �����
		OutputStream out = null;
		File file = new File("D://test//test.txt");
		try {

			out = new FileOutputStream(file); // ASCII��ֻ֧��
			// Ϊ��֧�ֶ���룬֧�����ģ�֧��int,֧��float��double��long

			/*
			 * FielterOutPutStream��FileterOutPoutSteram���ֵܣ�����OutputStream�ĺ���
			 * DataoutputStream��FIleterOutputStream�ĺ���
			 * DataOutputStream��OutputStream����
			 * OutputStream<----FileterOutptuStream<---DataOutputStream
			 * <--FileOutPu
			 */

			// �����ˣ�DataoutputStream
			DataOutputStream doc = new DataOutputStream(out);
			// writeUTF(String str) ������޹ط�ʽʹ�� UTF-8 �޸İ���뽫һ���ַ���д����������
			doc.writeUTF("�ú�ѧϰ���������ϣ���������");
			// writeBoolean(boolean v) ��һ�� boolean ֵ�� 1-byte ֵ��ʽд����������
			doc.writeBoolean(true);
			// writeDouble(double v) ʹ�� Double ���е� doubleToLongBits ������ double
			// ����ת��Ϊһ�� long ֵ��Ȼ�󽫸� long ֵ�� 8-byte ֵ��ʽд�����������У���д����ֽڡ�
			doc.writeDouble(78.88);
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
