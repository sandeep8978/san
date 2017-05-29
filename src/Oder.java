import java.util.ArrayList;

public class Oder {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(25);
		al.add(10);
		al.add(5);
		System.out.println("elements before sorting:");
		System.out.println(al);
		for(int i=0;i<al.size();i++){
			for(int j=0;j<al.size()-i-1;j++){
				if(al.get(j)>al.get(j+1)){
					int temp=al.get(j);
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
				}
			}
		}
System.out.println("elements after sorting.....");
System.out.println(al);
	}

}
