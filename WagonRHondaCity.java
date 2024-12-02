package quesBank3;

abstract class Car{
	protected boolean isSedan;
	protected String seats;
	public Car(boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}
	public boolean getIsSedan() {
		return this.isSedan;
	}
	
	public String getSeats() {
		return this.seats;
	}
	abstract public String getMileage();
	public void printCar(String name) {
		System.out.println("A"+name+"is"+(this.getIsSedan()? "":"not")+"Sedan, is"+this.getSeats()+"-seater,and has a mileage of around"+this.getMileage()+".");
	}
}
class WagonR extends Car{
	private int mileage;
	public WagonR(int mileage) {
		super(false,"4");
		this.mileage = mileage;
	}
	@Override
	public String getMileage() {
		return mileage + "kmpl";
	}
}

class HondaCity extends Car{
	private int mileage;
	public HondaCity(int mileage) {
		super(false,"4");
		this.mileage = mileage;
	}
	@Override
	public String getMileage() {
		return mileage + "kmpl";
	}
}
	
class InnovaCrysta extends Car{
	private int mileage;
	public InnovaCrysta(int mileage) {
		super(false,"4");
		this.mileage = mileage;
	}
	@Override
	public String getMileage() {
		return mileage + "kmpl";
	}
}
}
public class WagonRHondaCity {

}










