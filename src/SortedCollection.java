//TODO: Import libraries as needed
import java.util.NoSuchElementException;
import java.util.*;
import java.lang.*;



public class SortedCollection {
	// TODO: Add member variables or methods as needed
	ArrayList<Integer> list = new ArrayList<Integer>();
	/**
	 * Adds the number n to the collection.
	 * 
	 * @param n the number to add to the collection
	 * @return always returns true
	 */
	public boolean add(int n) {
		// TODO: Implement
		list.add(n);
		return true;
	}

	/**
	 * Removes the smallest number in the collection and returns it.
	 * If the collection is empty, throws a NoSuchElementException.
	 * 
	 * @return the smallest number in the collection
	 */
	public int remove() throws NoSuchElementException {
		// TODO: Implement
		if(list.isEmpty())
		{
			throw new NoSuchElementException();
		}

		//list.sort(Comparator.naturalOrder()); 	//ascending order
		list.remove(0);
		return 0;
	}

	/**
	 * Prints usage information.
	 */
	public static void showUsage() {
		System.out.println("Usage: java SortedCollection [num1] [num2] [num3] ...");
	}






	/**
	 * Main method. Receives a list of numbers as commandline arguments and prints
	 * out the list in sorted order from smallest to largest.
	 * 
	 * @param args commandline arguments; see showUsage() for detailed information
	 */

	public static void main(String[] args) {
		SortedCollection collection = new SortedCollection();

		

		if (args.length == 0) {
			showUsage();
			return;
		}
		
		// TODO: add numbers in commandline arguments to collection using the add(int) method.
		// If any commandline argument is not a number, call showUsage() and return.

		for (int i = 0; i < args.length; i++) {
			try{
				int input_num = Integer.parseInt(args[i]);
				//parseInt worked
				collection.add(input_num);
				System.out.println("input_num: " + input_num);
			}
			catch (NumberFormatException e)
			{
				//parseInt failed
				showUsage();
				return;
			}
		}
		// System.out.println("Print Arraylist using for each loop");
		// for( String listNums : list ){
  //  			System.out.println(listNums);
		// }

		// list.sort(Comparator.naturalOrder()); 	//ascending order

		
		System.out.print("sorted: ");
		for (int i = 0; i < args.length; i++) {
			int num = collection.remove();
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
