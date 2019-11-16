package material;

import stock.inventory;

public class laptops extends inventory
{
int id=20;
public laptops(int q,int lowOrder)
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
