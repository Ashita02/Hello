package quesBank3;

import java.util.Map;

class GroceryReceipt extends GroceryreceiptBase{
	public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
		super(prices, discounts);
	}
	@Override
	public List<Grocery> Calculate(List<Node> shoppingList){
		Map<String, Integer> list = new TreeMap<>();
		for(Node s:shoppingList) {
			String fruit = s.fruit;
			int sum = s.count;
			if(!list.containsKey(fruit)) {
				list.put(fruit, sum);
			}else {
				list.put(fruit, list.get(fruit)+sum);
			}
		}
		List<Grocery> res = new ArrayList<>();
		for(Map.Entry<String, Integer> entry: list.entrySet()) {
			String fruit = entry.getKey();
			int sum = entry.getValue();
			double price = getPrices().get(fruit);
			double total = 0;
			if(getDiscounts().containsKey(fruit)) {
				total = sum*price*(1-(double) getDiscounts().get(fruit)/100);
			}else {
				total = sum*price;
			}
			res.add(new Grocery(fruit, price,total));
		}
		return res;
	}
}

public class GroceryStore {

}
