package com.bridgelabz.Utility;

public class Stack {
int top;
int size;
char a[];
public Stack() 
{
	top=-1;
	size=20;
	a=new char[size];
}
public void push(char c)
{
	if(top>size)
	{
		System.out.println("Stack is full");
	}
	else
	{
		a[++top]=c;
		System.out.println("Pushed:"+a[top]);
		size++;
	}
}
public char pop() 
{
	if(isempty())
	{
		System.out.println("Stack is Empty");
	}
	System.out.println("Poped:"+peek());
	size--;
	return a[top--];
	
}
public char peek()
{
	return a[top];
}
public boolean isempty() 
{
	if(size==0)
		return true;
	return false;
}
public int size()
{
	return size;
}
}
