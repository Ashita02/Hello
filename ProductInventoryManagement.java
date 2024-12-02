package quesBank3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product>{
	String name;
	double price;
	int quantity;
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	@Override
	public int compareTo(Product other) {
		return this.name.compareTo(other.name);
	}
	@Override
	public String toString() {
		return name;
	}
}
public class ProductInventoryManagement {
	public void addProduct(List<Product> Prod, String name, double price, int quantity) {
		Prod.add(new Product(name,price,quantity));
	}
	public List<Product> sortProductByName(List<Product> Prod){
		Collections.sort(Prod);
		return Prod;
	}
	public List<Product> setProductByPrice(List<Product> Prod){
		Prod.sort(Comparator.comparingDouble(Product::getPrice));
		return Prod;
		}
	public List<Product> setProductByQuantity(List<Product> Prod){
		Prod.sort(Comparator.comparingInt(Product::getQuantity));
		return Prod;
}
	public static void main(String[] args) {
		 ProductInventoryManagement pim = new  ProductInventoryManagement();
		 List<Product> Prod = new ArrayList<>();
		 pim.addProduct(Prod,"Laptop",1000, 10);
		 pim.addProduct(Prod,"Phone",800, 20);
		 pim.addProduct(Prod,"tablet",600, 25);
		 
		 System.out.println(pim.sortProductByName(Prod));
		 System.out.println(pim.sortProductByPrice(Prod));
		 System.out.println(pim.sortProductNyQuantity(Prod));
	}
}
