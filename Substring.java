package quesBank3;

import java.util.Map;

public class Substring {
	public static void main(String[] args) {
		String s ="abcd";
		String t = "asdf";
		int k = 4;
		int maxLength = 3;
		System.out.println(s,t,k,maxLength);
	}
	public static int sameSubstring(String s, String t, int k, int maxLength) {
		int n = s.length();
		int m = t.length();
		int[] cost = new int[n];
		int maxmatch = 0;
		
		for(int i=0;i<n;i++) {
			cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
		}
		int windowCost = 0;
		int windowStart = 0;
		Map<Character, Integer> charCount = new Hashmap<>();
		for(int windowEnd = 0;windowEnd<n;windowEnd++) {
			char rightChar = s.charAt(windowEnd);
			charCount.put(rightChar, charCount.getOrDefault(rightChar, 0)+1);
			windowCost += cost[windowEnd];
			while(windowCost>k || windowEnd - windowStart + 1>maxLength) {
				char leftChar = s.charAt(windowStart);
				charCount.put(leftChar, charCount.get(leftChar)-1);
				if(charCount.get(leftChar) == 0) {
					charCount.remove(leftChar);
				}
				windowCost -= cost[windowStart];
				windowStart ++;
			}
			maxMatch = Math.max(maxMatch, windowEnd - windowStart + 1);
		}
		return maxMatch;
	}

}
