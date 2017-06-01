package hxzy.IO.project02;

import java.io.File;

public class Test {
	public static void main(String[] args) {

		// exists() 测试此抽象路径名表示的文件或目录是否存在。
		// isFile() 测试此抽象路径名表示的文件是否是一个标准文件
		// isDirectory() 测试此抽象路径名表示的文件是否是一个目录
		// 2.判断是目录还是文件

		// 3.如果是文件，就打印文件名，如果是目录就继续(递归)遍历
		Test t = new Test();
		t.readfile(new File("D://sql"));
	}

	public void readfile(File file) {

		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		} else {
			File[] fs = file.listFiles();
			for (File files : fs) {
				if (files.isDirectory()) {
					System.out.println("文件名" + files.getName() + "\t文件路径" + files.getAbsolutePath());
					readfile(files);
				}
				if (files.isFile()) {
					System.out.println("文件名" + files.getName());
				}
			}
		}
	}
}
