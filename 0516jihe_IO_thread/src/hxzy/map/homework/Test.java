package hxzy.map.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();

		Student stu = new Student();
		stu.setSid(1);
		stu.setName("张健");
		stu.setAge(22);
		map.put("张健", stu);

		Student stu2 = new Student();
		stu2.setSid(2);
		stu2.setName("张朵朵");
		stu2.setAge(21);
		map.put("张朵", stu2);

		Student stu3 = new Student();
		stu3.setSid(3);
		stu3.setName("张奎");
		stu3.setAge(23);
		map.put("张奎", stu3);

		List<Map.Entry<String, Student>> tolist = new ArrayList<Map.Entry<String, Student>>(map.entrySet());

		// 未排序之前
		for (Entry<String, Student> entry : tolist) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().getSid() + "\t" + entry.getValue().getAge()
					+ "\t" + entry.getValue().getName());
		}

		System.out.println("----------------------------------------");
		// 排序
		Collections.sort(tolist, new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
				// TODO Auto-generated method stub
				// return o2.getKey().toString().compareTo(o1.getKey());
				return o2.getValue().getSid() - o1.getValue().getSid();
			}
		});

		// 排序之后
		for (Entry<String, Student> entry : tolist) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().getSid() + "\t" + entry.getValue().getAge()
					+ "\t" + entry.getValue().getName());
		}

		System.out.println("----------------------------------------------------------");
		Collections.sort(tolist, new Agesort());
		// 排序之后
		for (Entry<String, Student> entry : tolist) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().getSid() + "\t" + entry.getValue().getAge()
					+ "\t" + entry.getValue().getName());
		}

	}
}
