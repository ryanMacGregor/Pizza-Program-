package pizza;
import until.Keyboard;



public class PizzaDriver
{
	public static int menu()
	{
		int choice = 0;
		String str_input;
		char input;
		
		Keyboard k = Keyboard.getKeyboard();
		
		str_input = k.readString("Would you like to order a pizza (Y,N)?");
		str_input = str_input.toLowerCase();
		imput = str_input.charAt(0);
		
		if(input == 'y')
		{
			Systyem.out.println("1. MeatLover's");
			Systyem.out.println("2. VeggieLover's");
			Systyem.out.println("3. Hawaiian");
			Systyem.out.println("Build your own");
			choice = k.readInt("Select from above: ");
			
			while(choice <1 || choice > 4)
			{
				System.out.println("Invalid input");
				choice = k.readInt("Select from above: ");
			}
		}
		else
		{
			choice =0;
		}
		return choice;
			
	}
	private static void requestSize(PizzaBuilder pizza_builder)
	{
		String str_choice;
		char charChoice;
		Keyboard k = Keyboard.getKeyboard();
		
		str_choice= k.readString("What size pizza (S/M/L)?");
		str_choice=str_choice.toUpperCase();
		charChoice= str_choice.charAt(0);
		
		while(charChoice != 'S' && charChoice != 'M' &&charChoice != 'L')
		{
			System.out.println("Invalid input");
			str_choice = k.readString("What size pizza (S/M/L)?");
			str_choice = str_choice.charAt(0);
		}
		pizza_builder.setSize(charChoice);
		
	}
	
	private static void requestCrust(PizzaBuilder pizza_builder)
	{
		String stringChoice;
		Keyboard k = Keyboard.getKeyboard();
		str_choice = k.readString("What size pizza (S/M/L)?");
		str_choice=str_choice.toUpperCase();
		while(!stringChoice.equals("THIN")&&!stringChoice.equals("PAN")&&!stringChoice("HAND"))
		{
			System.out.println("Invalid input");
			stringChoice = k.readString("What type of crust? (THIN/PAN/HAND ");
		}
		pizza_builder.setCrust(stringChoice);
	}
	private static void requestTopping(PizzaBuilder pizza_builder)
	{
		Keyboard k = Keyboard.getKeyboard();
		char topping = 'S';
		String str_topping;
		
		while(topping != 'D')
		{
			System.out.println("(P)epperoni, (O)nions, (G)reen Peppers, (S)ausage, (M)ushrooms, (D)one");
			str_topping = k.readString("select (P,O,G,S,M,D)");
			str_topping = str_topping.toUpperCase();
			topping = str_topping.charAt(0);
			
			if(topping != 'D')
			{
				pizza_builder.addTopping(topping);
			}
		}
	}
	private static void showOrder(DecoratedPizza dec_pizza)
	{
		System.out.println("Your pizza: ");
		System.out.println("Size: "+dec_pizza.toString());
	}
	public static void main(String[] args)
	{
		int pizzaChoice;
		double cost = 0;
		double totalCost = 0;
		PizzaBuilder pizza_builder = new PizzaBuilder();
		
		pizzaChoice = menu();
		
		if(pizzaChoice ==0)
		{
			
		}
		else if(pizzaChoice ==1)
		{
			pizza_builder = new MeatLover();
			
			requestSize(pizza_builder);
			requestCrust(pizza_builder);
			
			DecoratedPizza dec_pizza = pizza_builder.pizzaDone();
			showOrder(dec_pizza);
			
			cost += dec_pizza.pizzaCost();
			System.out.println("Cost:"+cost);
		}
		else if(pizzaChoice ==2)
		{
			pizza_builder = new VeggieLover();
			
			requestSize(pizza_builder);
			requestCrust(pizza_builder);
			
			DecoratedPizza dec_pizza = pizza_builder.pizzaDone();
			showOrder(dec_pizza);
			
			cost += dec_pizza.pizzaCost();
			System.out.println("Cost:"+cost);
		}
		else if(pizzaChoice == 3)
		{
			pizza_builder = new Hawaiian();
			
			requestSize(pizza_builder);
			requestCrust(pizza_builder);
			
			DecoratedPizza dec_pizza = pizza_builder.pizzaDone();
			showOrder(dec_pizza);
			
			cost += dec_pizza.pizzaCost();
			System.out.println("Cost:"+cost);
		}
		else if(pizzaChoice == 4)
		{

			
			requestSize(pizza_builder);
			requestCrust(pizza_builder);
			requestTopping(pizza_builder);
			
			DecoratedPizza dec_pizza = pizza_builder.pizzaDone();
			showOrder(dec_pizza);
			
			cost += dec_pizza.pizzaCost();
			System.out.println("Cost:"+cost);
		}
	}
	
}