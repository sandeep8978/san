import java.util.ArrayList;

public class sa {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("bcd");
		al.add("abc");
		al.add("vcs");
		System.out.println("duplicate elements:"+al);
		Object[] st=al.toArray();
		for(Object s:st){
			if(al.indexOf(s)!=al.lastIndexOf(s)){
				al.remove(al.lastIndexOf(s));
			}
		}
		System.out.println("distict list"+al);
	}

}
