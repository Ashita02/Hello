package quesBank3;

class Reporting implements IReporting{
	private List<Order> orders = new ArrayList<>();
	
	@Override
	public void addOrder(Order order) {
		orders.add(order);
	}
	@Override
	public int totalOrderAmountPerCustomer(int customerId) {
		int totalAmount = 0;
		for(Order order : orders) {
			if(order.customer.id == customerId) {
				totalAmount += order.amount;
			}
		}
		return totalAmount;
	}
	@Override
	public int totalOrderAmountOnDate(Date date) {
		int totalAmount = 0;
		for(Order order : orders) {
			if(isSameDate(order.date, date)) {
				totalAmount += order.amount;
			}
		}
		return totalAmount;
	}
	@Override
	public List<Order> getOrder(int customerId){
		List<Order> customerOrders = new ArrayList<>();
		for(Order order : orders) {
			if(order.customer.id == customerId) {
				customerOrders.add(order);
			}
		}
		return customerOrders;
	}
	private boolean isSamedate(Date date1, Date date2) {
		Calender cal1 = Calender.getInstance();
		Calender cal2 = Calender.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);
		return cal1.get(Calender.YEAR) == cal2.get(Calender.YEAR) && cal1.get(Calender.MONTH) == cal2.get(Calender.MONTH)&&cal1.get(Calender.DAY_OF_MONTH)==cal2.get(Calender.DAY_OF_MONTH);
	}
}

public class IReporting {

}
