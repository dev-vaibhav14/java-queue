package com.java.ds.queue;

public class QueueWithArray {
	
	static int [] arrQueue = new int[5];
	
	static int rear = -1;
	
	static int front = -1;
	
	static int size = arrQueue.length;
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		add(10);
		add(11);
		add(12);
		add(13);
		add(14);
		display();
		
		remove();
		remove();
		
		display();
	

	}
	
	public static void add(int data)
	{
	
		if(rear == size)
		{
			System.out.println("queue is full");
			return;		
		}
				
		rear++;
		arrQueue[rear] = data;
	}
	
	public static int remove()
	{
		int removedData = arrQueue[0];
		 for (int i = 0; i < rear; i++)
		{
			 arrQueue[i] = arrQueue[i + 1];	
		}
		 arrQueue[rear] = 0;
		 rear--;
		 front = -1;
		
		return removedData;
	}
	
	public boolean isEmpty()
	{
		return rear == arrQueue.length;
	}
	
	public static void display()
	{
		for (int i = 0; i < arrQueue.length; i++) 
		{
		 System.out.print(arrQueue[i]);	
		}
	}

}
