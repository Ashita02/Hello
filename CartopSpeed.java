package quesBank3;

class Car{
	String name;
	String topSpeed;
	public void printTopSpeed() {
		System.out.println("Top speed of vehicle is 100kmph");
	}
	public void printTopSpeed(int topSpeed) {
		System.out.println("Top speed of vehicle is" + topSpeed + "kmph");
	}
		public void printTopSpeed(String vehicle, int topSpeed) {
			System.out.println("Top speed of vehicle is" + vehicle + "is"+ topSpeed +"kmph");
	}
}

public class CartopSpeed {

}
