package com.bridgelabz.utility;

public class StackLinkList {
Node3 top=null;
int size=0;
public boolean isEmpty()
{
	if(top==null)
		return true;
	return false;
}
public void insert(Object data)
{
	Node3 newnode=new Node3(data);
	if(isEmpty())
	{
		newnode.linkNext=null;
	}
	else
	{
		newnode.linkNext=top;
	}
	top=newnode;
	size++;
//	System.out.println(top.data);
}
public Object delete()
{
	Node3 temp = null;
	if(isEmpty())
	{
		System.out.println("Stack is empty! Cannot delete");
	}
	else
	{
		temp=top;
		top=temp.linkNext;
		size--;
	}
	//System.out.println(temp.data);
	return temp.data;
}
public void display()
{
	if(isEmpty())
	{
		//System.out.println("Stack is empty");
	}
	else
	{
		Node3 temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.linkNext;
		}
	}
}
public static void main(String[] args) {
	StackLinkList s=new StackLinkList();
	s.insert(1);
	s.insert(2);
	s.insert("*");
	s.insert("*");
	s.insert("\n");
	s.insert("*");
	s.insert(3);
	s.display();
	System.out.println(s.delete());
	System.out.println(s.delete());
	System.out.println(s.delete());
	System.out.println(s.delete());
	System.out.println(s.delete());
	System.out.println(s.delete());
}
int size(){
	return size;
}
}
class Node3{
	Object data;
	Node3 linkNext;
	int size;
	public Node3()
	{
		data=null;
		linkNext=null;
		size=0;
	}
	public Node3(Object data)
	{
		this.data=data;
		this.linkNext=null;
	}
}