package pizza;

public class PizzaBuilder
{
//instance variables
	private Crust crust;


	private DecoratedPizza topLink;

	char crust_size

	String crust_type;

	public pizzaBuilder(crust_size, crust_type)
	{
		crust_size = 'S';
		crust_type = "THIN";

		this.crust = new Crust(crust_size,crust_type);
		this.topLink = new Pizza(crust);
		
		
	}

	protected void buildPizza()
	{
		Crust crust = new Crust(crust_size,crust_type);
		Pizza pizza = new Pizza(crust_size,crust_type)
		
		topLink = pizza;
	}

	public boolean setCrust(string try_crust)
	{
		crust_size = Character.topUpperCase(try_crust)

		if(try_crust=="THIN"||try_crust =="HAND"|| try_crust == "PAN")
		{
			this.crust_size = try_crust
			buildPizza();
			input =true;
		}
		else
		{
			input = false
		}
		return imput;
	}
	
	public void addTopping(char topping_char)
	{
		if(!(topping_char instanceof Pizza || topping_char instanceof PizzaTopping))
			{
				return;
			}
		
	}

	public  boolean setSize(char try_size)
	{
		try_size = Character.toUpperCase(try_Size);
		
		if(crust_size == "S" || "small" || "M"||"medium"||"L"||"large")
		{
			this.crust_size = try_Size
			buildPizza();
			input =true;
		}
		else
		{
			input =false;
		}
		return input
	}

	public DecoratedPizza pizzaDone()
	{
		DecoratedPizza tempDecPizza = new DecoratedPizza;
		
		topLink = tempDecPizza;

		crust_size = default;
		crust_type = default;

		buildPizza();
		
		return tempDecPizza;

	}

}