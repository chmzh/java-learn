package test1;

public class ProduceM extends ProduceDecorator {

	private Produce produce;
	public ProduceM(Produce produce) {
		this.produce = produce;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return produce.getDescription() + " ,ProduceM ";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 10+produce.cost();
	}

}
