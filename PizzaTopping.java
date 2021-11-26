package pizza;
public class PizzaTopping extends DecoratedPizza
{
	private String topping;
	private String letter;
	private double cost;
	
	public PizzaTopping(DecoratedPizza DecPizza, String topping,String letter,double cost)
	{
		super(DecPizza);
		this.topping = topping;
		this.letter = letter;
		this.cost = cost;
	}
	public double pizzaCost()
	{
		return (super.pizzaCost())+cost;
	}
	public void String toString()
	{
		return (super.toString()) + letter;
	}
	public getImage()
	{
		return(super.getImage())+ topping;
	}
}