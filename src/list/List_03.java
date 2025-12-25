package list;

import java.util.*;

public class List_03 {

	public static void main(String[] args) {

		Bank_custom ban = new Bank_custom(05, "Rupesh Raj", 20000.4);
		Bank_custom ban1 = new Bank_custom(04, "Visnhu Raj", 50000.4);
		Bank_custom ban2 = new Bank_custom(03, "Ravi Raj", 65000.4);
		Bank_custom ban3 = new Bank_custom(02, "Amresh Puri", 15000.4);
		Bank_custom ban4 = new Bank_custom(01, "Nandan Veer", 5000.4);
		
		ArrayList<Bank_custom> bank = new ArrayList<>();
		
		bank.add(ban); bank.add(ban1); bank.add(ban2); bank.add(ban3); bank.add(ban4);
		
		System.out.println(bank.get(2));
		
		
		
	}

}

class Bank_custom {
	int id;
	String name;
	double price;

	Bank_custom(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String toString()
	{
		return this.id + " "+this.name +" "+this.price;
	}

}