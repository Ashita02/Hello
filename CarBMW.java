package quesBank3;

class Car{
	public int no_of_times = 4;
	public String bodyType = "Plastic";
	public void reverseGear() {
		System.out.println("Reverse gear is applied...");
	}
	public void switchOnHeadLights() {
		System.out.println("Lights on...");
	}
}

class BMW extends Car{
	public String modelName = "X3";
    public void topSpeed() {
    	System.out.println("Top speed of BMW is 200 kmph");
    }
}
public class CarBMW {

}
 