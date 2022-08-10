package recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {

		System.out.println(BinaryRecursion(new int[] { 1, 2, 3, 55, 68, 88, 97 }, 0, 5, 55));
	}

	public static int BinaryRecursion(int[] a, int first, int last, int key) {

		if (first > last) {
			return -1;

		} else {
			int mid = (first + last) / 2;
			if (a[mid] == key) {
				return key;
			} else if (a[mid] > key) {

				return BinaryRecursion(a, first, mid - 1, key);
			} else {
				return BinaryRecursion(a, first + 1, last, key);
			}

		}
	}

}
