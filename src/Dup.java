import java.util.ArrayList;

public class Dup {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("a");
		al.add("sandeep");
		al.add(5);
		al.add(8);
		al.add(5);
		System.out.println("before sorting elements:"+al);
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("After removing elements"+al);
	}

}
