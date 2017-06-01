package hxzy.IO.project01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test3 {
	public static void main(String[] args) {
		// 输出流
		OutputStream out = null;
		File file = new File("D://test//test.txt");
		try {

			out = new FileOutputStream(file); // ASCII，只支持
			// 为了支持多编码，支持中文，支持int,支持float，double，long

			/*
			 * FielterOutPutStream和FileterOutPoutSteram是兄弟，都是OutputStream的孩子
			 * DataoutputStream是FIleterOutputStream的孩子
			 * DataOutputStream是OutputStream孙子
			 * OutputStream<----FileterOutptuStream<---DataOutputStream
			 * <--FileOutPu
			 */

			// 产生了，DataoutputStream
			DataOutputStream doc = new DataOutputStream(out);
			// writeUTF(String str) 与机器无关方式使用 UTF-8 修改版编码将一个字符串写入基础输出流
			doc.writeUTF("好好学习，天天向上，不打有序");
			// writeBoolean(boolean v) 将一个 boolean 值以 1-byte 值形式写入基础输出流
			doc.writeBoolean(true);
			// writeDouble(double v) 使用 Double 类中的 doubleToLongBits 方法将 double
			// 参数转换为一个 long 值，然后将该 long 值以 8-byte 值形式写入基础输出流中，先写入高字节。
			doc.writeDouble(78.88);
			System.out.println("写入文件完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
