import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class C {
	 
public static void main(String[] args){
    
    List<String>  al = new ArrayList<String>();
    
    al.add("a");
    al.add("b ");
    al.add("a");
    al.add("c");
    al.add("e");
    al.add("a");
    
    
    System.out.println("Before Removing duplicate elements:"+al);
    
    HashSet<String> linkedhashset = new HashSet<String>();
    
  
    linkedhashset.addAll(al);
 
    al.clear();
 
    al.addAll(linkedhashset);
 
    System.out.println("After Removing duplicate elements:"+al);
 
}
 
}
