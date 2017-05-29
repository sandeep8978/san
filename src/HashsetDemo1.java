import java.util.HashSet;

public class HashsetDemo1 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("sandeep");
		hs.add("abc");
		hs.add("time");
		if(hs.contains("sandeep"))
		{
			System.out.println("yes set contains the 'sandeep' String");
		}
		if(hs.contains("narendra"))
		{
			System.out.println("no set contains the  'narendra' String");
		}

	}

}
