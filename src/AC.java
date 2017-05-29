import java.util.ArrayList;
import java.util.List;

public class AC {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("sandeep");
		al.add("abc");
		al.add("abc");
		al.add("dbc");
		al.add("zbc");
		al.add("zbc");
		System.out.println("before duplicate elements"+al);
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("after remove duplicate Elements"+al);
	}

}
