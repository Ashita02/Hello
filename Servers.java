package quesBank3;

import java.util.Arrays;
import java.util.Map;

public class Servers {
	public static void findError(int n, List<String> logs) {
		Map<String, Integer> errorCounts = new HashMap<>();
		for(String log = logs) {
			String[] parts = log.split(" ");
			String server = parts[0];
			String status = parts[1];
			if(status.equals("error")) {
				errorCounts.put(server, errorCounts.getOrDefault(server,0)+1);
			}
		}
		System.out.println(errorCounts);
		int facultyServers = 0;
		for(int count : errorCounts.values()) {
			if(count>=n) {
				facultyServers += (count/n);
			}
		}
		System.out.println(facultyServers);
	}
	public static void main(String[] args) {
		List<String> li = Arrays.asList("s1 error","s1 error","s1 error","s2 success", "s1 error",);
		findError(2,li);
	}

}
