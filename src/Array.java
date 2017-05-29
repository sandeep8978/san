import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("sandeep");
		al.add("narendra");
		al.add("narendra");
		System.out.println(al);
		Set<String> s=new HashSet<>();
		for(String n:al){
			if(s.add(n)==false)
				System.out.println(n);
				
		}

	}

}
