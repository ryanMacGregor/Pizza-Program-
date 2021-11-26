package pizza;
public interface DecoratedPizza
{

	private double next_pizza_item;
	DecoratedPizza()
	{
		next_pizza_item = null;
	}
	
	public DecoratedPizza(DecoratedPizza)
	{
		next_pizza_item = DecoratedPizza;
		
		public double pizzaCost()
		{
			return next_pizza_item.pizzaCost();
		}
		public String toString()
		{
			return next_pizza_item.toString();
		}
		public String getImage()
		{
			return next_pizza_item.getImage();
		}
	}
}	