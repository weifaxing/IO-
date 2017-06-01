package hxzy.map.homework;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Agesort implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		// TODO Auto-generated method stub
		if (o1.getValue().getAge() - o2.getValue().getAge() == 1) {
			return 1;
		} else if (o1.getValue().getAge() - o2.getValue().getAge() == 0) {
			return 0;
		} else {
			return -1;
		}
	}
}
