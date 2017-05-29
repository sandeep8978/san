import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuedemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue =new PriorityQueue<>();
		queue.add("Sandeep");
		queue.add("narendra");
		queue.add("manohar");
		queue.add("arun");
		queue.add("tulas");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterater the queue elements");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements");
		Iterator <String> itr1=queue.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}

}
