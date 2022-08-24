
//3. Count the frequency of all distinct elements in the array, please mention the time and space complexity.
//{1,1,1,2,2,2,2,3,4,5,1,1,5,2,7};


package Assignment03;

public class CountFrequency {
	public static void main(String[] args) {

		int ar[] = { 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 1, 1, 5, 2, 7 };
		for (int i = 0; i < ar.length; i++) {
			int k = ar[i];
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (k == ar[j])
					count++;
			} // end of inner loop
			System.out.println(ar[i] + " counts:: " + count);
		} // end of outer loop
	}// end of main
}// end of class
