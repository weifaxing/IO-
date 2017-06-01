package hxzy.IO.project02;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {

		File file = new File("D://test");
		// listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件

		// listFiles(FileFilter filter)
		// 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录

		// listFiles(FilenameFilter filter)
		// 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
		File[] fs = file.listFiles();
		for (File file2 : fs) {
			System.out.println("获取文件名-->" + file2.getName() + "\t文件路径为-->" + file2.getAbsolutePath());
		}
	}
}
