package com.bridgelabz.Utility;

public class LinkedList<N> {
	Node<N> head=null;
	Node<N> tail=null;
	int size;
	static class Node<N>
	{
		N data;
		Node<N> next;
		public Node() {
			this.data=null;
			this.next=null;
		}
		Node(N data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node<N> start() {
		return head;
	}
	public void add(N item)
	{
		if(head==null)
		{
			Node<N> newnode=new Node<N>(item);
			head=newnode;
			tail=newnode;
		}
		else
		{
			Node<N> newnode=new Node<N>(item);
			Node<N> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			tail.next=newnode;
			tail=newnode;
		}
		size++;
	}
		
	public void remove(N item) 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node<N> temp=head;
			if(temp.data==item)
			{
				head=temp.next;
			}
			else
			{
				while(!(temp.next.data.equals(item)) && temp.next!=null)
				{
					temp=temp.next;
				}
				System.out.println(temp.next.data+" is deleted");
				temp.next=temp.next.next;
			}
		}
		size--;
	}
	public void search(N item) 
	{
		Node<N> temp=head;
		boolean status=false;
			while(temp.next!=null)
			{
				status=false;
				if(temp.data.equals(item))
				{
					status=true;
					break;
				}	
				temp=temp.next;
			}
			if(temp.data.equals(item))
				status=true;
			if(status==true)
			{
				System.out.println("Found in list");
				remove(item);
			}
			else
			{
				System.out.println("Not found in list, So it is Added to the list");
				add(item);
			}
	}
	public int size() 
	{
		int count=0;
		if(head==null)
		{
			return 0;
		}
		Node<N> cur=head;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		
		return count;
		
	}
	public boolean isEmpty() 
	{
		if(size==0)
			return true;
		else
			return false;
	}
	public void append(N item)
	{
		this.add(item);
	}
	public void index(N item)
	{
		Node<N> temp=head;
		int ind=0;
			while(temp!=null)
			{
				if(temp.data.equals(item))
				{
					System.out.println("Found in position:"+ind);
					break;
				}
				
				ind++;
				temp=temp.next;
			}
			
	}
	public void insertAt(int pos,N item) 
	{
		if(pos>size()-1 || pos<1)
		{
			System.out.println("Cannot add");
		}
		else
		{
			Node<N> newnode= new Node<N>(item);
			
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Node<N> previous=head;
				int count=1;
				while (count<pos-1)
				{
					previous=previous.next;
					count++;
				}
				Node<N> current=previous.next;
				newnode.next=current;
				previous.next=newnode;
			}
		}
        size++ ;
	}
	public void pop() 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node<N> curr=head;
			Node<N> prev=null;
			while(curr.next!=null)
			{
				prev=curr;
				curr=curr.next;
			}
			prev.next=null;
		}
		size--;
	}
	public void pop(int pos) 
	{
		if(pos>size()-1 || pos<1)
		{
			System.out.println("Cannot pop");
		}
		if(pos==1)
		{
			Node<N> temp=head;
			head=head.next;
			temp.next=null;
		}
		else
		{
			Node<N> previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Node<N> current=previous.next;
			previous.next=current.next;
			current.next=null;
		}
	}
	public void display() 
	{
		Node<N> temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		/*LinkedList list= new LinkedList();
		list.add(5);
		list.add(9);
		list.add(8);
		list.append(10);
		list.display();
		list.index(9);
		list.insertAt(2, 12);
		list.pop();
		list.pop(1);
		list.display();*/
		
	
	}
}
