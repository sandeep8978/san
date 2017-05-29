import java.util.ArrayList;
import java.util.List;

public class Nothing {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(500);
		al.add(200);
		al.add(10);
		al.add(5);
		al.add(25);
		al.add(60);
		System.out.println("before sorting elements:");
		System.out.println(al);
		for(int i=0;i<al.size();i++){
			for(int j=0;j<al.size()-i-1;j++){
				if(al.get(j)<al.get(j+1)){
					int temp=al.get(j);
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
				}
			}
		}
		System.out.println("after sorting elements");
		System.out.println(al);
		
		

	}

}
