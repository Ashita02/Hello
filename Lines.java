package quesBank3;

import java.util.Scanner;

class Point{
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.getY() - p1.getY(), 2)+ Math.pow(p2.getX()- p1.getX(), 2));
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class Lines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double x2 = sc.nextDouble();
	    double y2 = sc.nextDouble();
	    
	    Point p1 = new Point(x1, y1);
	    Point p1 = new Point(x2, y2);
	    
	    Line line = new Line(p1, p2);
	    lines.add(line);
}
	
	LineList myList = new LineList(lines);
	Line maxLine = myList.getLineWithMaxLength();
