package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {

		int[] a = { 1, 2, 56, 99, 6 };
		int key = 56;

		System.out.println(search(a, key));
	}

	public static int search(int a[], int x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}

		}
		return -1;
	}

}
