package hashsettoset;
import java.util.HashSet;
public class HashSet_Demo 
{

	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add(25);
		h1.add(25);
		h1.add(54);
		h1.add("mourya");
		h1.add(null);
		h1.add('M');              //it doess not follow indexing//
		System.out.println(h1);  //it does not allow duplicates//
		                         
		
		
		HashSet h2 = new HashSet();
		h2.add("rambo");
		h2.add("Srilanka");
		h2.addAll(h1);
		System.out.println(h2);  
		
		//h2.clear();
		//System.out.println(h2);
		
		
		System.out.println(h2.contains("rambo"));
		
		h2.add("man");
		System.out.println(h2);
		
		System.out.println("Is Empty:"+ h2.isEmpty());
		
		System.out.println("size :"+h2.size());
		
		
		

		
		

	}

}
