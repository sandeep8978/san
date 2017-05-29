import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<>();
		hm.put(101, "sandeep");
		hm.put(200, "nani");
		hm.put(103, "suresh");
		hm.put(105, "sandeep");
		for(Map.Entry<Integer, String>m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
