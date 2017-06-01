package hxzy.IO.project02;

import java.io.File;

public class Test {
	public static void main(String[] args) {

		// exists() ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ�
		// isFile() ���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ�
		// isDirectory() ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
		// 2.�ж���Ŀ¼�����ļ�

		// 3.������ļ����ʹ�ӡ�ļ����������Ŀ¼�ͼ���(�ݹ�)����
		Test t = new Test();
		t.readfile(new File("D://sql"));
	}

	public void readfile(File file) {

		if (!file.exists()) {
			System.out.println("�ļ�������");
			return;
		} else {
			File[] fs = file.listFiles();
			for (File files : fs) {
				if (files.isDirectory()) {
					System.out.println("�ļ���" + files.getName() + "\t�ļ�·��" + files.getAbsolutePath());
					readfile(files);
				}
				if (files.isFile()) {
					System.out.println("�ļ���" + files.getName());
				}
			}
		}
	}
}
