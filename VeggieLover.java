public class VeggieLover extends PizzaBuilder()
{
	public VeggieLover()
	{
		super();
	}
	protected void buildPizza()
	{
		super.buildPizza();
		super.addTopping("G");
		super.addTopping("O");
		super.addTopping("M");
	}
	
	
}