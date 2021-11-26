public class MeatLover extends PizzaBuilder()
{
	public MeatLover()
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