
public class string {
public static void main(String[] args) {
	String s1="Lakshmi Priya Biraka";
		String a[]=s1.split(" ");
		String s="";
		for(int i=0;i<a.length;i++)
		{
			StringBuffer sb=new StringBuffer(a[i]);
			s+=sb.reverse()+" ";
		}
		System.out.println(s);
	}
}