package hxzy.IO.project02;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {

		File file = new File("D://test");
		// listFiles() ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ�

		// listFiles(FileFilter filter)
		// ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼

		// listFiles(FilenameFilter filter)
		// ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
		File[] fs = file.listFiles();
		for (File file2 : fs) {
			System.out.println("��ȡ�ļ���-->" + file2.getName() + "\t�ļ�·��Ϊ-->" + file2.getAbsolutePath());
		}
	}
}
