package hxzy.IO.project01;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {

		// ��D�����潨��һ��text�ļ�--б����Ҫ���ļ�ϵͳ������Ҫת���ַ�
		// File(String pathname) ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
		File file = new File("D://test1");
		// exists() ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ�
		if (!file.exists()) {
			try {
				// createNewFile() ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
				file.createNewFile();
				System.out.println("�����ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��ѽ�����");
		}
	}
}
