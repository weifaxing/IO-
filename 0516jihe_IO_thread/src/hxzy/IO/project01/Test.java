package hxzy.IO.project01;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {

		// 在D盘下面建立一个text文件--斜杠需要和文件系统反向，需要转义字符
		// File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		File file = new File("D://test1");
		// exists() 测试此抽象路径名表示的文件或目录是否存在。
		if (!file.exists()) {
			try {
				// createNewFile() 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
				file.createNewFile();
				System.out.println("创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已近存在");
		}
	}
}
