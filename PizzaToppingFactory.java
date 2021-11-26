public class PizzaToppingFactory
{
	public static DecoratedPizza addPepperoni(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Pepperoni\n","P",0.99);
	}
	public static DecoratedPizza addSausage(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Sausage\n","S",0.99);
	}public static DecoratedPizza addOnions(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Onions\n","O",0.79);
	}public static DecoratedPizza addGreenPeppers(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "GreenPeppers\n","G",0.69);
	}
	public static DecoratedPizza addMushrooms(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Mushrooms\n","M",0.79);
	}
	public static DecoratedPizza addPineapple(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Pineapple\n","A",0.89);
	}public static DecoratedPizza addHam(DecoratedPizza dec_pizza)
	{
		return new PizzaTopping(dec_pizza, "Ham\n","H",0.89);
	}
}