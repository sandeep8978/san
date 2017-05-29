import java.util.ArrayList;
import java.util.HashSet;

public class Dupl {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
	    al.add("ABC");
	    al.add("ABC");
	    al.add("ABCD");
	    al.add("ABCD");
	    al.add("ABCE");

	   System.out.println(al);
	   HashSet<String> hs=new HashSet<>();
	   hs.addAll(al);
	   al.clear();
	   al.addAll(hs);
	   System.out.println("removing dup:"+al);
	}
}

			
		
		
		
		
	


