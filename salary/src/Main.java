import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double HRA, DA,Gross = null;
		int x=sc.nextInt();
		if(x<15000)
		{
			HRA=(double)((15*x)/100);
			DA=(double)((90*x)/100);
			Gross=(double)(x+HRA+DA);
			
		}
		else if(x>=15000)
		{
			HRA=5000.00;
			DA=(double)((98*x)/100);
			Gross=(double)(x+HRA+DA);	
		}
		System.out.printf("%.2f",Gross);
	}

}
