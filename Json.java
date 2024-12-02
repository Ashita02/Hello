package quesBank3;


public static List<String> getJSONDiff(String json1, String json2){
	Map<String, String> map1 = parseJSON(json1);
	Map<String, String> map2 = parseJSON(json2);
	List<String> diffKeys = new ArrayList<>();
	
	for(String key : map1.keySet()) {
		if(map2.containsKey(key) && !map1.get(key).equals(map2.get(key))) {
			diffKeys.add(key);
		}
	}
	Collections.sort(diffKeys);
	return diffKeys;
	
}
private static map<String, String> parseJSON(String json){
	Map<String, String> map = new HashMap<>();
	String[] keyValuePairs = json.replaceAll("[{}\"]","").split(",");
	for(String pair:keyValuePairs) {
		String[] keyValue = pair.split(":");
		map.put(keyValue[0], keyValue[1]);
	}
	return map;
}
}
public class Json {

}
