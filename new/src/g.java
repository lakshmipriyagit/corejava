import java.util.Scanner;
public class g {
	    public static void main(String[] args)
	    {
	        System.out.println("Enter branding expenses");
	        Scanner sc=new Scanner(System.in);
	        String s1=sc.nextLine();
	        Double d1 = Double.parseDouble(s1);
	        System.out.println("Enter travel expenses");
	        String s2=sc.nextLine();
	        Double d2 = Double.parseDouble(s2);
	        System.out.println("Enter food expenses");
	        String s3=sc.nextLine();
	        Double d3 = Double.parseDouble(s3);
	        System.out.println("Enter logistics expenses");
	        String s4=sc.nextLine();
	        Double d4 = Double.parseDouble(s4);
	        Double D=d1+d2+d3+d4;
	        System.out.print("Total expenses : Rs.");
	        System.out.printf("%.2f",D);
	        System.out.println();
	        Double x=((d1/D)*100);
	        System.out.print("Branding expenses percentage : ");
	        System.out.printf("%.2f",x);
	        System.out.println("%");
	        Double y=(d2/D)*100;
	        System.out.print("Travel expenses percentage : ");
	        System.out.printf("%.2f",y);
	        System.out.println("%");
	        Double z=(d3/D)*100;
	        System.out.print("Food expenses percentage : ");
	        System.out.printf("%.2f",z);
	        System.out.println("%");
	        Double w=(d4/D)*100;
	        System.out.print("Logistics expenses percentage : ");
	        System.out.printf("%.2f",w);
	        System.out.println("%");
	    }
	    
}
