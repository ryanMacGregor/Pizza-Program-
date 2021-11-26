public class PizzaFee extends DecoratedPizza
{
	private String msg;
	private double fee;
	
	public PizzaFee(DecoratedPizza DecPizza, String msg, double fee)
	{
		super(DecPizza);
		this.msg = msg;
		this.fee = fee;
	}
	public String toString()
	{
		return DecoratedPizza.toString() + msg;
	}
	public double pizzaCost()
	{
		return DecoratedPizza.pizzaCost() + fee;
	}
}