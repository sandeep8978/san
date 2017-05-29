import java.util.ArrayList;
import java.util.Iterator;

public class dupli {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> al1=new ArrayList<>();
	al.add(25);
	al.add(10);
	al.add(25);
	al.add(5);
	System.out.println(al);
	Iterator<Integer> itr=al.iterator();
	while(itr.hasNext()){
		Integer  itr1=(Integer)itr.next();
		if(al1.contains(itr1)==false)
			al1.add(itr1);
	}
	System.out.println(al1);


}
}