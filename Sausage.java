public class Sausage extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Sausage(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.99;
	}

	public void String toString()
	{
		return (super.toString()) + "Sausage";
	}
	public getImage()
	{
		return(super.getImage())+ "S";
}