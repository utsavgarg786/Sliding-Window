package SlidingWindow;

public class Solution {

	public static void main(String[] args) {

		int num = 430043;
		int k= 2;
		int ans = divisorSubString(num ,k);
		System.out.println(ans);
}

	private static int divisorSubString(int num, int k) {
		int i = 0;
		int j = 0;
		String s = Integer.toString(num);
		int n = s.length();
		int count = 0;
		String sum = "";
		while(j<n) {
			sum = sum + s.charAt(j);
			if(j-i+1 == k) {
				int a = Integer.parseInt(sum);
				if((a != 0) && (num % a == 0)) {
					count++;
				}
				sum = sum.substring(1);
				i++;
			}
			j++;
		}
		
		return count;
	}
}