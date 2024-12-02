package quesBank3;

List<int[]> events = new ArrayList<>();
int n = start.size();
for(int i=0;i<n;i++) {
	events.add(new int[] {start.get(i),1});
	events.add(new int[] {end.get(i),-1});
}
Collections.sort(events, (a,b)->{
	if(a[0] != b[0]) return a[0]-b[0];
	return b[1]-a[1];
});
int maxInteractions = 0;
int maxTime = -1;
int currInteractions = 0;
for(int[] event : events) {
	if(currInteractions>maxInteractions) {
		maxInteractions = currInteractions;
		maxTime = event[0];
	}
}
return maxTime;

public class ClinetServer {

}
