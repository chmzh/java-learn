package test.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class Test {
	public static void main(String[] args) {
		LocalDateTime localTime = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
		
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(localTime.format(formatter));
		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.computeIfAbsent("a", (abc)->abc+"abc");

		hashMap.forEach((a,b)->System.out.println(a+"="+b));
		
		Thread thread = new Thread(()->{System.out.println("interrupt thread");Thread.currentThread().interrupt();System.out.println("interrupt thread1");});
		thread.start();
		

//		StampedLock lock = new StampedLock();
//		
//		lock.tryWriteLock();
//		
//		long time = lock.tryOptimisticRead();
//		
//		lock.unlockRead(time);
		//test();
		long b = 2;
		long a = b = 1;
		
		System.out.println(a+":"+b);
	}
	
	
	public static boolean test(){
		for(;;){
			boolean bol = false;
			int a = 1;
			return bol;
		}
	}
	
	
}
