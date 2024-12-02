package quesBank3;
import java.util.*;

public class MaximumSubstringCost {
	public static int maxLenSubstring(String s, String t, int k) {
		int maxLength = 0;
		for(int i=0;i<s.length();i++) {
			int cost = 0;
			int length = 0;
			for(int j=i;j<s.length() && j-i+1<=t.length();j++) {
				if(s.charAt(j)!=t.charAt(j-i)) {
					cost++;
				}
				if(cost>k) {
					break;
				}
				length++;
			}
			maxLength = Math.max(maxLength, length);
		}
		return maxLength;
	}
	 public static void main(String[] args) {
		 String s = "abcd";
		 String t = "pqrs";
		 int k = 4;
		 int maxLength = maxLenSubstring(s,t,k);
		 System.out.println("Max len of substr : "+ maxLength);
	 }

}
