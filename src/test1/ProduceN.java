package test1;

public class ProduceN extends ProduceDecorator {

	private Produce produce;
	public ProduceN(Produce produce) {
		this.produce = produce;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return produce.getDescription() + " ,ProduceN ";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 10+produce.cost();
	}

}
