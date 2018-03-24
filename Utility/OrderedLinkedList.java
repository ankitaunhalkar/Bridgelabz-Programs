package com.bridgelabz.Utility;

public class OrderedLinkedList<N extends Comparable<N>>
{
	Node1<N> head;
	Node1<N> tail;
	int size;
	static class Node1<N>
	{
		N data;
		Node1<N> next;
		public Node1() {
			this.data=null;
			this.next=null;
		}
		Node1(N data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void add(N item)
	{
		Node1<N> newnode=new Node1<N>(item);
        Node1<N> curr, prev = null;
        boolean ins = false;
        if (head == null)
           head = newnode;
        else if (item.compareTo( head.data)<=0)
        {
            newnode.next=head;
            head = newnode;
        }
        else
        {
            prev = head;
            curr = head.next;
            while(curr != null)
            {
                if (item.compareTo(prev.data) >= 0 && item.compareTo(curr.data)<=0)
                {
                    prev.next=newnode;
                    newnode.next=curr;
                    ins = true;
                    break;
                }
                else
                {
                    prev = curr;
                    curr = curr.next;
                }
            }
            if (ins == false)
            {
                prev.next=newnode;
            }
        }
        size++;
		/*Node1<N> end=head;
		if(head==null)
		{
			head=newnode;
			end=head;
			System.out.println(item);
		}
		else if(head.data.compareTo(item)>0)
		{
			newnode.next=head;
			head=newnode;
			System.out.println(item);
		}
		else if(end.data.compareTo(item)<0)
		{
			end.next=newnode;
			newnode=end;
			System.out.println(item);
		}
		else
		{
			Node1<N> tempPrev=head;
			Node1<N> tempCurr=head.next;
			while((tempCurr!=end) && (tempCurr.data.compareTo(item)<0))
			{
				tempPrev=tempCurr;
				tempCurr=tempCurr.next;
			}
			tempPrev.next=newnode;
			newnode=tempCurr;
			System.out.println(item);
		}
		size++;*/
	}
	public void remove(N item) 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node1<N> temp=head;
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
		Node1<N> temp=head;
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
			if(temp.data==item)
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
		Node1<N> cur=head;
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
		Node1<N> temp=head;
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
			Node1<N> newnode= new Node1<N>(item);
			
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Node1<N> previous=head;
				int count=1;
				while (count<pos-1)
				{
					previous=previous.next;
					count++;
				}
				Node1<N> current=previous.next;
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
			Node1<N> curr=head;
			Node1<N> prev=null;
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
			Node1<N> temp=head;
			head=head.next;
			temp.next=null;
		}
		else
		{
			Node1<N> previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Node1<N> current=previous.next;
			previous.next=current.next;
			current.next=null;
		}
	}
	void printList()
    {
        Node1<N> temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
    }
	public static void main(String[] args) {
		OrderedLinkedList<Integer> list= new OrderedLinkedList<Integer>();
		list.add(8);
		list.add(5);
		list.add(9);
		list.search(5);
		list.append(10);
		list.printList();
		//list.index(9);
		//list.insertAt(2, 12);
		//list.pop();
		//list.pop(1);
		//list.printList();
		
	
	}
}
