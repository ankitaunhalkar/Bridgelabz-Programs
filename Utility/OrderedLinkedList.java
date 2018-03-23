package com.bridgelabz.Utility;

public class OrderedLinkedList<N extends Comparable<N>>
{
	Nodee<N> head=null;
	Nodee<N> tail=null;
	int size;
	static class Nodee<N>
	{
		N data;
		Nodee<N> next;
		public Nodee() {
			this.data=null;
			this.next=null;
		}
		Nodee(N data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void add(N item)
	{
		Nodee<N> newnode=new Nodee<N>(item);
		Nodee<N> end=head;
		if(head==null)
		{
			newnode=head;
			end=head;
		}
		else if(head.data.compareTo(item)>0)
		{
			newnode.next=head;
			head=newnode;
		}
		else if(end.data.compareTo(item)<0)
		{
			end.next=newnode;
			newnode=end;
		}
		else
		{
			Nodee<N> tempPrev=head;
			Nodee<N> tempCurr=head.next;
			while((tempCurr!=end) && (tempCurr.data.compareTo(item)<0))
			{
				tempPrev=tempCurr;
				tempCurr=tempCurr.next;
			}
			tempPrev.next=newnode;
			newnode=tempCurr;
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
			Nodee<N> temp=head;
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
		Nodee<N> temp=head;
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
		Nodee<N> cur=head;
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
		Nodee<N> temp=head;
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
			Nodee<N> newnode= new Nodee<N>(item);
			
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Nodee<N> previous=head;
				int count=1;
				while (count<pos-1)
				{
					previous=previous.next;
					count++;
				}
				Nodee<N> current=previous.next;
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
			Nodee<N> curr=head;
			Nodee<N> prev=null;
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
			Nodee<N> temp=head;
			head=head.next;
			temp.next=null;
		}
		else
		{
			Nodee<N> previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Nodee<N> current=previous.next;
			previous.next=current.next;
			current.next=null;
		}
	}
	public void display() 
	{
		Nodee<N> temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
