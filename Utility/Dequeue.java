package com.bridgelabz.Utility;

public class Dequeue {
	int size;
	char queue[];
	int rear;
	int front;
	int capacity;
	public Dequeue() 
	{
		capacity=20;
		size=0;
		queue=new char[capacity];
		rear=front=-1;	
	}
	void addFront(char item)
	{
		if(size>capacity)
		{
			System.out.println("Overflow");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;
				rear=0;
			}
			else
				if(front==0)
					front=capacity-1;
				else
					front=front-1;
			queue[front]=item;
			System.out.println("Inserted into front of queue:"+item);
		}
		size++;
	}
	void addRear(char item)
	{
		if(size>capacity)
		{
			System.out.println("Queue is overloaded");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
			queue[++rear]= item;
			front=0;
			}
			else
			{
				queue[++rear]=item;
			}
			System.out.println("Inserted into rear of queue:"+item);
			size++;
		}
	}
	char removeFront()
	{
		/*if(isEmpty())
		{
			System.out.println("Queue is Underflow");
		}
		else
		{
			System.out.println("Poped from front of queue:"+queue[front++]);
		}*/
		size--;
		return queue[front++];
	}
	
	char removeRear()
	{
		/*if(isEmpty())
		{
			System.out.println("Queue is Underflow");
		}
		else
		{
			System.out.println("Poped from rear of queue:"+queue[rear--]);
		}*/
		size--;
		return queue[rear--];
	}
	
	boolean isEmpty()
	{
		if(size()==0)
		{
			return true;
		}
		else
			return false;
	}
	int size()
	{
		return size;
	}
	/*public static void main(String[] args) {
		Dequeue deq=new Dequeue();
		 	deq.addFront('a');
		    deq.addFront('b');
	        deq.addRear('c');
	        deq.addRear('d');
	        deq.addRear('k');
	        deq.addFront('l');
	        deq.addRear('m');
	        deq.addFront('o');
	        deq.removeFront();
	        deq.removeFront();
	        deq.removeRear();
	        deq.removeRear();
	        deq.removeFront();
	        deq.removeRear();
	}*/
}
