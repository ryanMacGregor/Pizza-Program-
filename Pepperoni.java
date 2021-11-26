public class Pepperoni extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Pepperoni(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.99;
	}

	public void String toString()
	{
		return (super.toString()) + "Pepperoni";
	}
	public getImage()
	{
		return(super.getImage())+ "P";
}