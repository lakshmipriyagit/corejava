import java.util.Scanner;

public class hand1 {

	public static void main(String[] args) {
		int n,sum=0;
		float avg=0;
		int a[]={1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements..."+sum);
		avg=(float)sum/a.length;
		System.out.println("average of elements..."+avg);
	}

}
