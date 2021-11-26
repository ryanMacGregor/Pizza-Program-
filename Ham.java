public class Ham extends PizzaToppings
{
	DecoratedPizza DecPizza = new DecPizza();
	
	public Ham(DecoratedPizza DecPizza)
	{
		super(DecPizza);
	}
	public double pizzaCost()
	{
		return (super.pizzaCost()) + 0.89;
	}

	public void String toString()
	{
		return (super.toString()) + "Ham";
	}
	public getImage()
	{
		return(super.getImage())+ "H";
}