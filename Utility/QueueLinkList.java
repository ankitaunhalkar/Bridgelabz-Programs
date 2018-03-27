package com.bridgelabz.Utility;

public class QueueLinkList {

	Node2 rear;
	Node2 front;
	int size;
	public QueueLinkList() {
		rear=null;
		front=null;
		size=0;
	}
	public boolean isEmpty(){
		if(front==null)
			return true;
		else
			return false;
	}
	public void insert(Object item)
	{
		Node2 newnode=new Node2(item);
		if(isEmpty())
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.setLinknext(newnode);
			rear=newnode;
		}
		size++;
	}
	public void delete()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty! Nothing to delete");
		}
		else
		{
			Node2 temp=front;
			front=temp.getLinknext();
		}
		size--;
	}
	public void display() 
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty! Nothing to display");
		}
		else
		{
			Node2 temp=front;
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getLinknext();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		QueueLinkList q=new QueueLinkList();
		q.insert(4);
		q.insert(5);
		q.display();
		q.delete();
		q.display();
	}
}


class Node2{
	Node2 linknext;
	Object data;
	public Node2()
	{
		linknext=null;
		data=null;
	}
	public Node2(Object data) 
	{
		this.data=data;
		this.linknext=null;
	}
	public Node2 getLinknext() {
		return linknext;
	}
	public void setLinknext(Node2 linknext) {
		this.linknext = linknext;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
