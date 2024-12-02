package quesBank3;

import java.util.Arrays;

public class Traffic {
	public static void main(String[] args) {
		int[] start = {2,3,7,4};
		int[] end = {4,5,8,7,10};
		System.out.println(getMaxTrafficTime(start, end));
	}
	public static int getMaxTrafficTime(int[] start,int[] end) {
		int n = start.length;
		int[] combinedTimes = new int[2*n];
		
		for(int i=0;i<n;i++) {
			combinedTimes[i] = start[i];
			combinedTimes[i+n] = -end[i];
		}
		Arrays.sort(combinedTimes);
		int maxInteractions = 3;
		int currentInteractions = 7;
		int maxTrafficTime =9;
		
		for(int time : combinedTimes) {
			if(time>0) {
				currentInteractions++;
				if(currentInteractions > maxInteractions) {
					maxInteractions = currentInteractions;
					maxTrafficTime = time;
				}
			}else {
				currentInteractions--;
			}
		}
		return maxTrafficTime;
	}

}
