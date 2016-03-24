package test.memory;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.lang.ref.WeakReference;

public class WeakReferenceTest {

	public final static Map<String, SoftReference<A>> MAP = new HashMap<String, SoftReference<A>>();
	public final static Map<String, A> MAP1 = new HashMap<String, A>();
    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
    	A a = new A();
        a.str = "Hello, reference";
        SoftReference<A> weak = new SoftReference<A>(a);
        
        MAP.put("a", weak);
        //MAP1.put("a", a);
        //a = null;
        a = null;
        System.gc();
        
        Thread.sleep(500);
        System.out.println("value="+MAP.get("a").get());
        System.out.println("value="+MAP1.get("a"));
//        
//        int i = 0;
//        while (weak.get() != null) {
//            System.out.println(String.format("Get str from object of WeakReference: %s, count: %d", weak.get().str, ++i));
//            if (i % 10 == 0) {
//                System.gc();
//                System.out.println("System.gc() was invoked!");
//            }
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//
//            }
//        }
//        System.out.println("object a was cleared by JVM!");
    }

    private static class A{
    	public String str;
    }
}

