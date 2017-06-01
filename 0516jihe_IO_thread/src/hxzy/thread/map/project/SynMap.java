package hxzy.thread.map.project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynMap implements Runnable {
	Map map = new HashMap();

	// public SynMap(Map map) {
	// // TODO Auto-generated constructor stub
	// this.map = map;
	// }

	public static void main(String[] args) {
		SynMap syn = new SynMap();
		Thread m1 = new Thread(syn, "A线程");
		Thread m2 = new Thread(syn, "C线程");
		Thread m3 = new Thread(syn, "B线程");

		m1.start();
		m2.start();
		m3.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("map-->" + syn.map.size());
		System.out.println(syn.map.keySet().size());

		Set key = syn.map.keySet();
		Iterator itr = key.iterator();
		while (itr.hasNext()) {
			System.out.println("键-->" + itr.next() + "\t值-->" + syn.map.get(itr.next()));
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				map.put(i + " " + name, i + "");
			}
		}
	}
}
