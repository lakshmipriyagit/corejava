
public class checkwrap {
public static void main(String[] args) {
	Integer x=10;
	Integer y=20;
	exchange(x,y);
	
}
static void exchange (Integer i,Integer j)
{
	Integer t;
	t=i;i=j;j=t;
	System.out.println("x--->"+i);
	System.out.println("y--->"+j);		
}
}
