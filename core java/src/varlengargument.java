
public class varlengargument {
public static void main(String[] args) {
	change("hi",10);
	change("hello",10,20,3);
	change("how",10,2,6,8);
	change("are you",10,6,2,87,6);
	
	
}
static void change(String s,int...a)
{
	System.out.print(s+"---->");
	for(int i=0;i<a.length;i++)
	{
		
		System.out.print(" "+a[i]);
		
	}
	System.out.println();
}
}
