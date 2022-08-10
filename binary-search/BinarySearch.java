package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println(search(new int[] { -1, 2, 5, 6, 9, 10, 22, 25, 27 }, 6));

	}

	public static int search(int[] a, int key) {

		int first = 0;
		int last = a.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;

			if (a[mid] == key) {
				return mid;

			} else if (a[mid] > key) {
				last = mid - 1;

			} else {
				first = mid + 1;
			}

		}
		return -1;
	}

}
