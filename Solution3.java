package SlidingWindow;
import java.util.Arrays;

public class Solution3 {

	public static void main(String[] args) {

		int[] a = {9,4,1,7};
		int k =2;
		int minDiff = minimumDifference(a,k);
		System.out.println(minDiff);
	}

	private static int minimumDifference(int[] a, int k) {
		Arrays.sort(a);
		int i=0; 
		int j=1;
		int minDiff = Integer.MAX_VALUE;
		int diff= 0;
		int length = a.length-1;
		
		while(j<=length) {
			diff = a[j] -a[i];
			if(j-i+1 ==k) {
				if(diff<minDiff) {
					minDiff = diff;
				}
				i++;
			}
			j++;
		}
		return minDiff;
	}

}
