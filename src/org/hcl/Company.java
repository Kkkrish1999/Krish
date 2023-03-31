package org.hcl;

public class Company extends Employee {
public void comName() {
	System.out.println("Company Name:Hcl");

}
public void comId() {
	System.out.println("Company Id:1234");
}
public static void main(String[] args) {
	Company c=new Company();
	c.comName();
	c.comId();
	
	
}
}

