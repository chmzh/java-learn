package test.nio;

import java.nio.IntBuffer;

public class Test {

	public static void main(String[] args) {
		IntBuffer buffer = IntBuffer.allocate(20);
		
		buffer.put(1);
		buffer.put(2);
		buffer.put(3);
		buffer.position(1);
		int[] copy = new int[10];
		
		buffer.get(copy);
		
		for (int i : copy) {
			System.out.println(i);
		}
	}

}
