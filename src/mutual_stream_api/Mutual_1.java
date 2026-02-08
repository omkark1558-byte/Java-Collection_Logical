package mutual_stream_api;

import java.util.ArrayList;
import java.util.List;

public class Mutual_1 {

	public static void main(String[] args) {
	
		Resource obj = new Resource();
		
		Pradoucer first = new Pradoucer();
		
		Consumer second = new Consumer();
		
		first.code =obj;
		second.code = obj;
		
		first.start();
		second.start();
		
		

	}
}
class Resource
{
	List<Integer> list = new ArrayList<>();
	int num = 0;
	public  synchronized void addNumber() throws InterruptedException
	{ 
		if(list.size()==10)
		{
			System.out.println("Waiting......!");
			wait();
		}
		list.add(num);
		notify();
		System.out.println("Producer"+ num);
		num++;
	}
	
	public synchronized void RemoveNumber() throws InterruptedException
	{
		 if(list.size()==10)
		 {
			 System.out.println("Waiting..... [] B Block");
			 wait();
		 }
		int i = list.remove(0);
		 System.out.println("Remove The Eelements....⚠️"+ i);
		 notify();
	}
}

class Pradoucer extends Thread
{
	Resource code;
	
	public void run()
	{
		try {
			code.addNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

class Consumer extends Thread
{
	Resource code;
	
	public void run()
	{
		try {
			code.RemoveNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
