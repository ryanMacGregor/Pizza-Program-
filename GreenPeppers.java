public class GreenPeppers extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public GreenPeppers(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.69;
	}

	public void String toString()
	{
		return (super.toString()) + "GreenPeppers";
	}
	public getImage()
	{
		return(super.getImage())+ "G";
}