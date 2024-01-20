package SlidingWindow;

public class SumOfthreeSubSequenceNo {

	public static void main(String[] args) {

		int[] a = { 2, 9, 1, 3, 14, 0, 9, 7, 5, 23 };
		int k = 3;
		int sum = sumOfThreeConsecutiveNumber(a, k);
		System.out.println("Sum of three number = " + sum);
	}

	private static int sumOfThreeConsecutiveNumber(int[] a, int k) {
		int max = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		int length = a.length - 1;
		while (j <= length) {
			sum = sum + a[j];
			if (j - i + 1 == k) {
				if (sum > max) {
					max = sum;
				}
				sum = sum - a[i];
				i++;
			}
			j++;
		}
		return max;
	}

}
