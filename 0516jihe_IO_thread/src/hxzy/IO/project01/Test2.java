package hxzy.IO.project01;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {

		// ��D�����潨��һ��text�ļ�--б����Ҫ���ļ�ϵͳ������Ҫת���ַ�
		// File(String pathname) ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
		File file = new File("D://test2//test1//test.txt");
		// exists() ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ�
		if (!file.exists()) {
			// getParentFile() ���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null
			File pfile = file.getParentFile();
			pfile.mkdirs();
			// mkdir() �����˳���·����ָ����Ŀ¼
			// mkdirs() �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼
			System.out.println("�����ɹ�");
		} else {
			System.out.println("�ļ��ѽ�����");
		}
	}
}
