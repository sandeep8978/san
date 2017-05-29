import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveMultipleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(1);
		al.add(2);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			int x=(Integer)itr.next();
			if(x>20)
			itr.remove();
		}
		System.out.println("after modification:"+al);

	}

}
