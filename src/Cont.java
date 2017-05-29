import java.util.HashSet;

public class Cont {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("sandeep");
		hs.add("abc");
		hs.add("time");
		if(hs.contains("sandeep"))
		{
			System.out.println("yes contains in sandeep");
		}
		if(hs.contains("mahesh"))
		{
			System.out.println("no contains in mahesh");
		}
	}

}
