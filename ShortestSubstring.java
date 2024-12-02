package quesBank3;

import java.util.Arrays;

class Result{
	public static int findMinLength(String s) {
		int n = s.length();
		boolean[] visited = new boolean[26];
		Arrays.fill(visited, false);
		int len = 0;
		for(int i = 0;i<n;i++) {
			if(visited[s.charAt(i) - 'a']) {
				for(int j=n-1;j>=i;j--) {
					if(visited[s.charAt(j)- 'a']) {
						len = j-i+1;
						break;
					}else {
						visited[s.charAt(j)- 'a'] = true;
					}
				}
				break;
			}else {
				visited[s.charAt(i) - 'a'] = true;
			}
		}
		return len;
	}
	public static int findShortestSubstring(String s) {
		int ans = findMinLength(s);
		s = new StringBuilder(s).reverse().toString();
		ans = Math.min(ans, findMinLength(s));
		return ans;
	}
}

public class ShortestSubstring {

}
