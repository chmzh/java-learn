package test1;

public class Test {
	public static void main(String[] args) {
		Produce produce1 = new Produce1();		
		Produce produce = new ProduceM(produce1);
		produce = new ProduceN(produce);
		System.out.println(produce.getDescription() + produce.cost());
	}
}
