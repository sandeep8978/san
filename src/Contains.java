import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("sandeep");
		al.add("sai");
		al.add("mahesh");
		al.add("narendra");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("sorting"+al);
		
	}

}
