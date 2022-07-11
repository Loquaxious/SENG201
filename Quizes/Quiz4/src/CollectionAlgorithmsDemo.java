import java.util.*;

public class CollectionAlgorithmsDemo {
	
	public static void main(String[] args) {
		// create array lists
		List<String> myList = new ArrayList<String>();
		List<String> otherList = new ArrayList<String>();
		
		
		// populate list
		myList.add("M");
		myList.add("I");
		myList.add("G");
		myList.add("U");
		myList.add("E");
		myList.add("L");
		
		System.out.println("Initial list: " + myList);
		
		Collections.sort(myList);
		System.out.println("Sorted list :" + myList);
		
		otherList = Arrays.asList("A","B","C","D");
		System.out.println("Are lists disjoint? " + Collections.disjoint(myList, otherList));
		
		myList.add("X");
		Collections.shuffle(myList);
		System.out.println("Shuffled list: " + myList);

		//Collection<String> unmodifiable = Collections.unmodifiableCollection(myList);

		// trying to modify UNMODIFIABLE list
		//unmodifiable.add("Z"); 

	}

}
