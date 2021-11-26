public class Pineapple extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Pineapple(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.89;
	}

	public void String toString()
	{
		return (super.toString()) + "Pineapple";
	}
	public getImage()
	{
		return(super.getImage())+ "A";
}