package SlidingWindow;

public class NumOfSubarrays {

	public static void main(String[] args) {

		int[] num = {2,2,2,2,5,5,5,8};
		int k = 3;
		double threshold = 4;
		int ans = numOfSubArrays(num, k , threshold);
		System.out.println(ans);
	}

	private static int numOfSubArrays(int[] num, int k, double threshold) {

		int i = 0; 
		int j = 0;
		int n = num.length;
		double sum = 0;
		int count = 0;
		while(j<n) {
			sum = sum + num[j];
			if(j-i+1 == k) {
				double avg = sum / k;
				if(avg < threshold) {
					count++;
				}
				sum = sum - num[i];
				i++;
			}
			j++;
		}
		return count;
	}

}
