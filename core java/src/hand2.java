
public class hand2 {

	public static void main(String[] args) {
		int a[]={1,3,5,16,8,2},temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];	
			}
		}
		System.out.println("largest is.."+temp);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<temp)
			{
				temp=a[i];
			}
		}
		System.out.println("smallest is.."+temp);
	}

}
