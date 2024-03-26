package ArrayPackage;
	

//methods:

//add
//size
//get
//contains
//indexOf
//replace
//remove
//isEmpty
//print
//ensureCapacity


//Additional methods added:

//reverse
//join
//count



public class Arraylist<T> {
	final int DEFAULT_CAPACITY = 10;
	Object[] array;
	int size;
	
	//constructor
	
	Arraylist(){
		this.array = new Object[DEFAULT_CAPACITY];
		this.size = 0;
	}
	
	//adding into arraylist
	
	void add(T value) {
		ensureCapacity();
		array[size++] = value;
	}
	
	//getting size of arraylist
	
	void size() {
		System.out.println(size);
	}
	
	//getting value at a specific index
	
	void get(int index) {
		System.out.println(array[index]);
	}
	
	//check whether arraylist contains a value
	
	void contains(T checkValue) {
		System.out.println(containsCheck(checkValue));
	}
	boolean containsCheck(T checkValue) {
		for(int i=0; i< size; i++) {
			if(array[i].equals(checkValue) || array[i] == checkValue) {
				return true;
			}
		}
		return false;
	}
	
	//getting index of a certain value
	
	void indexOf(T selectedValue) {
		System.out.println(index(selectedValue));
	}
	int index(T selectedValue) {
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(selectedValue) || array[i] == selectedValue) {
				return i;
			}
		}
		return -1;
	}
	
	//replacing one value with another
	
	void replace(T oldValue, T newValue) {
		int idx = index(oldValue);
		array[idx] = newValue;
	}
	
	//removing an element at specified position
	
	void remove(int index) {
		array[index] = null;
		size -= 1;
	}
	
	//checks for empty arraylist
	
	boolean isEmpty() {
		System.out.println(array.equals(null));
		return array.equals(null);
	}
	
	//prints the array
	
	void print() {
		for(int i=0; i<array.length; i++) {
//			if(array[i] != null && i != size-1) {
//				System.out.print(array[i] + ",");
//			}
			if(array[i] != null) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
	
	//increases the capacity
	
	void ensureCapacity() {
		if(size == array.length) {
			int alteredCapacity = array.length * 2;
			array = extendArray(array, alteredCapacity);
		}
	}
	
	void reverse() {
		for(int i=array.length-1; i>=0; i--) {
			if(array[i] != null) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
	void join(T seperator) {
		String joinValue = "";
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {
				if(i == array.length-1) {
					joinValue += array[i].toString();
				}
				else {
					joinValue += (array[i].toString() + seperator);
				}
			}
		}
		System.out.println(joinValue.substring(0, joinValue.length()-1));
	}
	
	
	void count(T value) {
		int retCount = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value && array[i] != null) {
				retCount++;
			}
		}
		System.out.println(retCount);
	}
	
	//makes a copy of the existing array 
	
	Object[] extendArray(Object[] array, int alteredCapacity){
		return java.util.Arrays.copyOf(array, alteredCapacity);
	}
	
	//using all functions in main method
	
	public static void main(String[] args) {
		Arraylist<String> sample = new Arraylist<String>();
		
		//add
		sample.add("Charu");
		sample.add("Priya");
		sample.add("Vijila");
		sample.add("Rose");
		sample.add("Charu");
		
		System.out.println("Printing all elements of the arraylist");
		
		//print
		sample.print();
		sample.join("/");
		sample.count("Charu");
		System.out.println();
		System.out.println("Printing size of the arraylist");
		
		//size
		sample.size();
		
		System.out.println();
		System.out.println("Contains Charu?");
		
		//contains
		sample.contains("Charu");
		
		System.out.println();
		System.out.println("Index of Priya");
		
		//indexOf
		sample.indexOf("Priya");
		
		System.out.println();
		System.out.println("Replacing");
		
		//replace
		sample.replace("Priya", "Charu");
		
		sample.print();
		System.out.println();
		System.out.println("Getting 0th element of the arraylist");
		
		//get
		sample.get(0);
		
		System.out.println();
		System.out.println("removing 0th element of the arraylist");
		
		//remove
		sample.remove(0);
		sample.remove(2);
		
		sample.print();
		System.out.println();
		System.out.println("Size of the arraylist after removing");
		sample.size();
		System.out.println();
		System.out.println("Check whether arraylist is empty");
		
		//isEmpty
		sample.isEmpty();
		System.out.println();
		System.out.println("Reverse the arraylist");
		
		//Reverse (additional method)
		sample.reverse();
		System.out.println();
		System.out.println("join using - ");
		
		//join
		sample.print();
		sample.join("-");
	}
}
