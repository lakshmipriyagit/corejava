package hcl;

public class student {
	int rollno;
	String name;
	float fee;
	student()
	{
		this(10);
		System.out.println("lucky.....");
	}
	student(int i)
	{
		System.out.println("priya..."+i);
	}
	void display()
	{
		System.out.println(rollno+" +name+" "+fee);
	}

	public static void main(String[] args) {
		

	}

}
