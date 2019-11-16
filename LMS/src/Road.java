
public class Road extends vehicle{
	
public void Road() {
		System.out.println("super calss....");
	}
	public static void main(String[] args) {
		truck ob=new truck();
		bus ob1=new bus();
		car ob2=new car();
		ob.vehicleSpeed("green",6,"shs");
		System.out.println(ob.Color+" "+ob.noOfWheels+" "+ob.model);
		ob1.vehicleSpeed("red",8,"ghg");
		System.out.println(ob1.Color+" "+ob1.noOfWheels+" "+ob1.model);
		ob2.vehicleSpeed("black",4,"audi");
		System.out.println(ob2.Color+" "+ob2.noOfWheels+" "+ob2.model);
		}
	}
