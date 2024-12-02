package quesBank3;
import java.util.*;

class Address{
	String pin;
	String city;
	
	Address(){
		
	}
	public Address(String pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, pin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pin, other.pin);
	}
}

class Employee{
	int eid;
	String ename;
	int age;
	String email;
	Address address;
	
	Employee(){
}
	
	
public Employee(int eid, String ename, int age, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.email = email;
	}

public Employee(int eid, String ename, int age, String email, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.email = email;
		this.address = address;
	}
public int getEid() {
	return eid;
}


public void setEid(int eid) {
	this.eid = eid;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", email=" + email + "]";
}
public boolean equals(Object O) {
	Employee e = (Employee) O;
	if(this.eid==e.eid && this.ename.equals(e.ename)&& this.age == e.age && this.email.equals(e.email)&& this.address.equals(e.address))
		return true;
	else 
		return false;
} 
public int hashCode() {
	return this.ename.length();
}
}

public class EmployeeMaster {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		Address a1 = new Address("111", "Kanpur");
		Address a2 = new Address("111", "Kanpur");
		Address a3 = new Address("112", "Indore");
		Address a4 = new Address("113", "Abad");
		
		Employee e1 = new Employee(1,"nnn",21,"nnn@gmail.com",a1);
		Employee e2 = new Employee(1,"nnn",21,"nnn@gmail.com",a2);
		Employee e3 = new Employee(2,"ppp",22,"ppp@gmail.com",a3);
		Employee e4 = new Employee(2,"ppp",22,"ppp@gmail.com",a4);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees.size());
	}
}
