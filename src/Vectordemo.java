import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(4);
		v.add(3);
		v.add(2);
		v.add(1);
		System.out.println("add number are:");
		for(Integer i:v){
			System.out.println(i);
		}
	}

}
