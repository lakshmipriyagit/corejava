import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		Vector<String> ob=new Vector<>();					
		ob.add("lucky");
		ob.add("priya");
		/*for(String s:ob)
		{
			System.out.println(s);
		}*/
		/*Enumeration<String> e=ob.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/
		System.out.println(ob.size());//ob.add(x);
		
		Iterator <String> it=ob.iterator();
		while(it.hasNext())
		{
			String i=it.next();
			System.out.println(i);
		}
		

	}

}
