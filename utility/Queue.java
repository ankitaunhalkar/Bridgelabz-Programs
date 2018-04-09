package com.bridgelabz.utility;

public class Queue {
int size;
int queue[];
int rear;
int front;
int capacity;
public Queue() 
{
	capacity=20;
	size=0;
	queue=new int[capacity];
	rear=front=-1;
}
void enqueue(int item)
{
	if(size()>capacity)
	{
		System.out.println("Queue is overloaded");
	}
	else
	{
		if(front==-1 && rear==-1)
		{
		queue[++rear]=item;
		front=0;
		}
		else
		{
			queue[++rear]=item;
		}
		System.out.println("You are Inserted into queue");
		size++;
	}
}
void dequeue()
{
	if(isEmpty())
	{
		System.out.println("Queue is Underflow");
	}
	else
	{
		System.out.println("You are Poped from queue:"+queue[front++]);
	}
	size--;
}
boolean isEmpty()
{
	if(size==0)
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
void display()
{
	if(front==-1)
	{
		System.out.println("Queue is empty");
	}
	else
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
}
/*public static void main(String a[])
{ 
    Queue queue = new Queue();
    queue.enqueue(4);
    queue.dequeue();
    queue.enqueue(56);
    queue.enqueue(2);
    queue.enqueue(67);
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(24);
    queue.dequeue();
    queue.enqueue(98);
    queue.enqueue(45);
    queue.enqueue(23);
    queue.enqueue(435);
    queue.dequeue();
    queue.display();
    //System.out.println(queue.size());
}*/
}
