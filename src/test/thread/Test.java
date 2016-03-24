package test.thread;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public final static Map<String, WeakReference<String>> MAP = new HashMap<String, WeakReference<String>>();
	
	public static void main(String[] args) {
//		ExecutorService es = Executors.newFixedThreadPool(5);
//		for (int i = 0; i < 100; i++) {
//			final int j = i;
//			es.submit(()->System.out.println("j="+j));
//		}
		
		String a = "abc";
		String b = a;
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		a = "abcd";
		System.out.println(a+":"+b);
		
		String path = System.getenv("PATH");
		System.out.println(path);
		
	}

}
