import java.util.*;
public class Main {
public static void main(String[] args) {
	employee e1=new employee();
	e1.setEmpNo(1);
	e1.setEmpName("lucky");
	employee e2=new employee();
	e1.setEmpNo(1);
	e1.setEmpName("lucky");
	Set<employee>ob=new HashSet();
	ob.add(e1);
	ob.add(e2);
	System.out.println("set size "+ob.size());
	Iterator <employee>it=ob.iterator();
	while(it.hasNext())
	{
		employee x=it.next();
		System.out.println(x.getEmpName()+" "+x.getEmpNo());
	}
}
}
