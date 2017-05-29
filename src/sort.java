import java.util.ArrayList;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> al=new ArrayList<>();
       al.add(101);
       al.add(102);
       al.add(10);
       Collections.sort(al);
       for(Integer I:al){
    	   System.out.println(I);
       }

	}

}
