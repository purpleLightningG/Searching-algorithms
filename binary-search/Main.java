package binarySearch;

public class Main {

	public static void main(String[] args) {

		int b[] = {1,2,3,66,77,88,99 };
	
	
	BinarySearch1 a = new BinarySearch1(b);
	
	a.forwardprint();
	a.search(88);
	a.forwardprint();
	
	}

}
