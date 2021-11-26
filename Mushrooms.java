public class Mushrooms extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Mushrooms(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.79;
	}

	public void String toString()
	{
		return (super.toString()) + "Mushrooms";
	}
	public getImage()
	{
		return(super.getImage())+ "M";
}