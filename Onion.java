public class Onion extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Onion(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.79;
	}

	public void String toString()
	{
		return (super.toString()) + "Onion";
	}
	public getImage()
	{
		return(super.getImage())+ "O";
}