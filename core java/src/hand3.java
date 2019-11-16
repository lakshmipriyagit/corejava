
public class hand3 {

	public static void main(String[] args) {
		int a[]={1,3,5,16,8,2},temp=16,x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==temp)
			{
				 x=i;
			}
		}
		if(x>0)
			System.out.println(x);
		else
		System.out.println("-1");
	}

}
