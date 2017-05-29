import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add(101);
		al.add("sandeep");
		al.add(100);
		al.add(101);
		System.out.println("Before Remove Duplicate Elements:"+al);
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
					
				}
					
				
				
			}
			
		}
		System.out.println("After Removing duplicate Elements"+al);
	}
	
}
