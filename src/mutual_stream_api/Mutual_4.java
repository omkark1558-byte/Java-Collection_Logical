package mutual_stream_api;

import java.util.ArrayList;
import java.util.List;

public class Mutual_4 {

	public static void main(String[] args) {
	 

		Tosource obj = new Tosource();
		
		Prodeces fi = new Prodeces();
		
		Consume se = new Consume();
		
		fi.br = obj;
		se.br = obj;
		
		se.start();
		fi.start();
		
	}

}

class Tosource
{
	List<Integer> list = new ArrayList<>();
	int count =1;
	
	public synchronized void Incress() throws InterruptedException
	{
		if(list.size()==10)
		{
			System.out.println("Memory Full.... .......");
			wait();
		}
		list.add(count);
		System.out.println("Remover Being Notifyed....✨");
		notify();
		count++;
		System.out.println("Adding : " +count);
	}
	public synchronized void Decress() throws InterruptedException
	{
		if(list.size()==0)
		{
			System.out.println("Waiting For Some Number's....⚠️");
			wait();
		}
		int li = list.remove(0);
		System.out.println("Removing : "+li);
		System.out.println("Notifying the Producer.....⚠️");
		notify();
	}
}
class Prodeces extends Thread{
	Tosource br;
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				br.Incress();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consume extends Thread
{
	Tosource br;
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(3000);
				br.Decress();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}