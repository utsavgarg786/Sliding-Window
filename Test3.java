package SlidingWindow;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		int[] arr = {9,4,1,7};
		int k =2;
		int minDiff = minimumDifference(arr,k);
		System.out.println(minDiff);
	}

	private static int minimumDifference(int[] arr, int k) {

		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		int n = arr.length;
		int minDiff = Integer.MAX_VALUE;
		int diff = 0;
		while(j<n) {
			diff= arr[j] - arr[i];
			if(j-i+1 == k) {
				if(diff < minDiff) {
					minDiff = diff;
				}
				i++;
			}
			j++;
		}
		return minDiff;
	}

}
