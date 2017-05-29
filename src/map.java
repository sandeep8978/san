import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "sandeep");
		map.put(102, "narendar");
		for(Map.Entry<Integer, String>m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
