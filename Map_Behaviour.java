//it store the data in the form of keys and value//
//it doesnot follow indexing//
//it doesnot allo duplicates//

package mapinterface;
import java.util.HashMap;
import java.util.Map;

public class Map_Behaviour 
{

	public static void main(String[] args)
	{
		      Map <String,Integer> m1 = new HashMap<String,Integer>();
		      m1.put("Shivakumar", 160334);
		      m1.put("Harshavardhan", 160335);
		      m1.put("Sachin", 160336);
		      m1.put("Sachin", 160336);
		      m1.put("bharath", 160337);
		      m1.put("nithya", 160339);
		      //System.out.println(m1);  
		
		      
		      Map <String,Integer> m2 = new HashMap<String,Integer>();
		      m2.put("Virat kohli", 160534);
		      m2.put("Rohit Sharma", 160535);
		      m2.put("Sachin tendulkar", 160636);
		      m2.put("Kallappa", 160736);
		      m2.put("Isuru Udana", 160837);
		      m2.put("Kushal mendis", 160939);
		      //System.out.println(m2);  
		      
		    
		      m2.putAll(m1);
		      System.out.println(m2);
		      
		      boolean b1 = m2.equals(m1);
		      System.out.println(b1);
		      
		      //clear method//
		      m1.clear();
		      System.out.println(m1);
		      System.out.println(m1.isEmpty());
		      
		      //if collection is empty we are putting some values by using this//
		      m1.putIfAbsent("Raju", 160465);
		      System.out.println(m1);
		      
		      //contains method//
		      boolean b3 = m2.containsKey("Virat kohli");
		      boolean b4 = m2.containsValue(160534);
		      System.out.println(b3);
		      System.out.println(b4);
		      
		      System.out.println("Kallappa contains ?"+m2.containsKey("Kallappas"));
		      
		      System.out.println("udana contains"+m2.containsKey("Isuru Udana"));

	}

}
