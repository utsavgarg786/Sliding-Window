package SlidingWindow;

public class Solution1 {

	public static void main(String[] args) {

		int[] a = {1,12,-5,-6,50,3};
		int k=4;
		double output = avgOfSubsequenceNumber(a,k);
		System.out.println(output);
	}

	private static double avgOfSubsequenceNumber(int[] a, int k) {
		int i = 0;
		int j = 0;
		double avg = 0;
		double highestAvg = 0;
	    int length = a.length - 1; 
	    double sum = 0;
	    while (j<=length) {
	    	sum = sum + a[j];
	    	if(j-i+1 == k) {
	    		avg = sum/k;
	    		if (avg > highestAvg) {
	    			highestAvg = avg;
	    		}
	    		sum = sum - a[i];
	    		i++;
	    	}
	    	j++;
	    }
		return highestAvg;
	}

}
