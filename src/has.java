import java.util.HashSet;

public class has {
	public static void main(String[] args) {
		HashSet<String> al=new HashSet<>();
		al.add("sandeep");
		al.add("narendra");
		if(al.contains("sandeep")){
			System.out.println("yest set contains 'sANDEP" );
			
		}
		if(al.contains("naresh")){
			System.out.println("yes not set contains ");
		}
	}

}
