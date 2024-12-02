package quesBank3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result{
	public static List<Integer> getQueryAnswers(List<List<String>> cache_entries, List<List<String>> queries){
		Map<String, String> cache = new HashMap<>();
		
		for(List<String> entry : cache_entries) {
			String key = entry.get(1) + entry.get(0);
			String value = entry.get(2);
			cache.put(key, value);
		}
		List<Integer> results = new ArrayList<>();
		for(List<String> query : queries) {
			String key = query.get(0);
			String timestamp = query.get(1);
			String cacheKey = key + timestamp;
			results.add(Integer.parseInt(cache.get(cacheKey)));
		}
		return results;
	}
}
public class Query {

}
