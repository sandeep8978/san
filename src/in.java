import java.util.ArrayList;

public class in {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(25);
		al.add(50);
		al.add(60);
		al.add(80);
		System.out.println("before assending"+al);
		for(int i=0;i<al.size();i++){
			for(int j=0;j<al.size()-i-1;j++){
				if(al.get(j)<al.get(j+1)){
					int temp=al.get(j);
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
					
				}
			}
		}
		System.out.println("after"+al);
	}

}
