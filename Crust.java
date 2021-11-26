package pizza;
public class Crust
{
	private char size;
	
	private String type;

	private Crust(size, type, cost)
	{
		public void getCrust
		{
			return type;
		}
		public void getCost
		{
			return size;
		}
		public String string
		{
			return new String("Size"+size+ "\n"+"Crust"+type+"\n");
			
		}
		public void crustCost
		{
			if(size == 'S' || 's')
			{
				cost += CrustSize.S.cost();
			}
			if(size == 'M' || 'm')
			{
				cost+= CrustSize.M.cost();
			}
			if(size == 'L' || 'l')
			{
				cost += CrustSize.L.cost();
			}
		}
		
	}
}
	
