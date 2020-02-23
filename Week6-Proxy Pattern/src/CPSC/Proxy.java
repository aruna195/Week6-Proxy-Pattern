package CPSC;

public class Proxy implements Cake{

	private static Cake cake;
	public Proxy() 
	{
		
		
	}

	public void doAction() {
		if (cake == null)
		{ 
			cake = new CakeImpl();
		}
		cake.doAction();
		
		}
	

}
