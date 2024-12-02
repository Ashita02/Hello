package quesBank3;

import java.math.BigDecimal;

public class AdditionalMagic {
	public String add(String a, String b) {
		return a+b;
	}
	public String add(double a, String b) {
		return String.valueOf(a) + b;
	}
	public String add(double a, double b) {
		Double c = (new Double(a) + new Double(b));
		BigDecimal bg = BigDecimal.valueOf(c);
		bg = bg.setScale(2, RoundingMode.HALF_UP); //<- can be change acc to code.
		return String.valueOf(bg.doubleValue());
	}

}
