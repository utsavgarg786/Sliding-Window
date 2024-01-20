package SlidingWindow;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

	public static void main(String[] args) {

		String s = "aababcabd";
		int k = 3;
		int a = goodString(s,k);
		System.out.println(a);
	}

	private static int goodString(String s, int k) {

		int i = 0;
		int j= 0;
		int length = s.length();
		String sum = "";
		int count = 0;
		while(j<length) {
			sum = sum + s.charAt(j);
			if(j-i+1 == k) {
				Set<Character> set = new HashSet<>();
				for(int c = 0; c < sum.length(); c++) {
					set.add(sum.charAt(c));
				}
				if(set.size() == 3) {
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
