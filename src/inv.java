import java.util.ArrayList;
import java.util.Collections;

public class inv {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("sandeep");
		al.add("mahesh");
		al.add("raju");
		al.add("malesh");
		al.add("liysee");
		al.add("londan");
		System.out.println("Assending order"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after Assending:"+al);
	}

}
