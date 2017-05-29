import java.util.ArrayList;

public class d {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		 al.add("ABC");
		    al.add("ABC");
		    al.add("ABCD");
		    al.add("ABCD");
		    al.add("ABCE");
		System.out.println("duplicate list:"+al);
		Object[] st=al.toArray();
		for(Object s:st){
			if(al.indexOf(s)!=al.lastIndexOf(s)){
				al.remove(al.lastIndexOf(s));
			}
			
		}
		System.out.println("Distinct List "+al);
	}

}
