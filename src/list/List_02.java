package list;

import java.util.*;

public class List_02 {

	public static void main(String[] args) {

		Bank ban = new Bank("Rupesh Raj", "70-450", 20000.4);
		Bank ban1 = new Bank("Visnhu Raj", "250-450", 50000.4);
		Bank ban2 = new Bank("Ravi Raj", "768-450", 65000.4);
		Bank ban3 = new Bank("Amresh Puri", "890-450", 15000.4);
		Bank ban4 = new Bank("Nandan Veer", "250-450", 85000.4);

		List<Bank> list = new ArrayList<>();
		list.add(ban);
		list.add(ban1);
		list.add(ban2);
		list.add(ban3);
		list.add(ban4);

		for (Bank k : list) {
			System.out.println("^ "+k);
		}

	}

}

class Bank {
	String Assetid;
	String Assetname;
	double Assetsalary;

	Bank(String Assetid, String Assetname, double Assetsalary) {
		this.Assetid = Assetid;
		this.Assetname = Assetname;
		this.Assetsalary = Assetsalary;
	}

	public String toString() {
		return this.Assetname + " - " + this.Assetsalary + " - " + this.Assetid;
	}

}
