package material;

import stock.inventory;

public class Accessories extends inventory
{

	int id=2;
	public Accessories(int q,int lowOrder)
	{
		super(q,lowOrder);
	}
	public void orintder()
	{
		if(q>lowOrder)
		{
			System.out.println("order is processed ");
		}
		else
		{
			requestMaterials();
		}
			
	}
	 void requestMaterials()
	{
		System.out.println("request for material...");
	}

	}


