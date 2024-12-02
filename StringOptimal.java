package quesBank3;

import java.util.Scanner;

public class StringOptimal {
	psvm{
		Scanner sc = new Scanner(System.in);
		int countA = sc.nextInt();
		int countB = sc.nextInt();
		int maxA = sc.nextInt();
		int maxB = sc.nextInt();
		int maxLength = Math.min(countA/maxA, countB/maxB)* Math.min(maxA, maxB);
		if(maxA>1) {
			maxLength += Math.min(countA%maxA, maxA - 1);
			}
		if(maxB > 1) {
			maxLength += Math.min(countB%maxB, maxB - 1);
		}
		System.out.println(maxLength);
		}

}
