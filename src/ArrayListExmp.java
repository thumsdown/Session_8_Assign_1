import java.util.*;
public class ArrayListExmp {
public static void main(String[] args) {
	ArrayList<String> myList = new ArrayList<String>();
	
	myList.add("Prashant");
	myList.add("Sunny");
	myList.add("Ashish");
	myList.add("Himanshu");
	myList.add("Vinit");
	myList.add("Anup");
	
	Iterator<String> itr = myList.iterator();
	
	while(itr.hasNext())
	{
		System.out.println("Flat 417 member= "+itr.next());
	}
}
}
