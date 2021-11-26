public class PizzaDiscount extends DecoratedPizza
{
	private String msg;
	private double discount;
	
	public PizzaFee(DecoratedPizza DecPizza, String msg, double discount)
	{
		super(DecPizza);
		this.msg = msg;
		this.discount = discount;
	}
	public String toString()
	{
		return DecoratedPizza.toString() + msg;
	}
	public double pizzaCost()
	{
		return DecoratedPizza.pizzaCost() *1-discount;
	}
}