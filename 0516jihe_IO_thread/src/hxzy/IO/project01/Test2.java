package hxzy.IO.project01;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {

		// 在D盘下面建立一个text文件--斜杠需要和文件系统反向，需要转义字符
		// File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		File file = new File("D://test2//test1//test.txt");
		// exists() 测试此抽象路径名表示的文件或目录是否存在。
		if (!file.exists()) {
			// getParentFile() 返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null
			File pfile = file.getParentFile();
			pfile.mkdirs();
			// mkdir() 创建此抽象路径名指定的目录
			// mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录
			System.out.println("创建成功");
		} else {
			System.out.println("文件已近存在");
		}
	}
}
