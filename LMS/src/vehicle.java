
public class vehicle {
	String Color;
	int noOfWheels;
	String model;
	vehicle()
	{
	 Color="red";
	 noOfWheels=6;
	 model="standard";
	}
}
	 class truck extends vehicle
	{
		void vehicleSpeed(String c,int w,String m)
		{
			Color=c;
			noOfWheels=w;
			model=m;
			System.out.println("truck speed is 100km");
		}
	}
	 class  bus extends vehicle
	{
		void vehicleSpeed(String c,int w,String m)
		{
			Color=c;
			noOfWheels=w;
			model=m;
			System.out.println("bus speed is 60km");
		}
	}
	 class car extends vehicle
	{
		void vehicleSpeed(String c,int w,String m)
		{
			Color=c;
			noOfWheels=w;
			model=m;
			System.out.println("car speed is 50km");
		}
	}



