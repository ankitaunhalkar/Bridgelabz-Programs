package com.bridgelabz.utility;

public class Hashing {

	/**
	 * @param args
	 */
	/*OrderedLinkedList<Integer> s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	public Hashing() {
		s0=new OrderedLinkedList<Integer>();
		s1=new OrderedLinkedList<Integer>();
		s2=new OrderedLinkedList<Integer>();
		s3=new OrderedLinkedList<Integer>();
		s4=new OrderedLinkedList<Integer>();
		s5=new OrderedLinkedList<Integer>();
		s6=new OrderedLinkedList<Integer>();
		s7=new OrderedLinkedList<Integer>();
		s8=new OrderedLinkedList<Integer>();
		s9=new OrderedLinkedList<Integer>();
		s10=new OrderedLinkedList<Integer>();
	}
	public void add(int item)
	{
		int remainder=item % 11;
		switch (remainder) {
		case 0: s0.add(item);			
				break;
		case 1: s1.add(item);
				break;
		case 2: s2.add(item);
				break;
		case 3: s3.add(item);
				break;
		case 4: s4.add(item);
				break;
		case 5: s5.add(item);
				break;
		case 6: s6.add(item);
				break;
		case 7: s7.add(item);
				break;
		case 8: s8.add(item);
				break;
		case 9: s9.add(item);
				break;
		case 10: s10.add(item);
				break;
		default:
			break;
		}
				
	}
	
	public boolean contains(int item) {
		int remainder=item % 11;
		switch (remainder) {
		case 0: if(!s0.isEmpty())
				return s0.search1(item);			
				break;
		case 1: if(!s1.isEmpty())
				return s1.search1(item);			
				break;
		case 2: if(!s2.isEmpty())
				return s2.search1(item);			
				break;
		case 3: if(!s3.isEmpty())
				return s3.search1(item);			
				break;
		case 4: if(!s4.isEmpty())
				return s4.search1(item);			
				break;
		case 5: if(!s5.isEmpty())
				return s5.search1(item);			
				break;
		case 6: if(!s6.isEmpty())
				return s6.search1(item);			
				break;
		case 7: if(!s7.isEmpty())
				return s7.search1(item);			
				break;
		case 8: if(!s8.isEmpty())
				return s8.search1(item);			
				break;
		case 9: if(!s9.isEmpty())
				return s9.search1(item);			
				break;
		case 10:if(!s10.isEmpty())
				return s10.search1(item);
		default:
			break;
	}
		return false;
	}
	public void remove(int item) {
		int remainder=item % 11;
		switch (remainder) {
		case 0: if(!s0.isEmpty())
				s0.remove(item);			
				break;
		case 1: if(!s1.isEmpty())
				s1.remove(item);			
				break;
		case 2: if(!s2.isEmpty())
				s2.remove(item);		
				break;
		case 3: if(!s3.isEmpty())
				s3.remove(item);			
				break;
		case 4: if(!s4.isEmpty())
				s4.remove(item);			
				break;
		case 5: if(!s5.isEmpty())
				s5.remove(item);			
				break;
		case 6: if(!s6.isEmpty())
				s6.remove(item);			
				break;
		case 7: if(!s7.isEmpty())
				s7.remove(item);			
				break;
		case 8: if(!s8.isEmpty())
				s8.remove(item);			
				break;
		case 9: if(!s9.isEmpty())
				s9.remove(item);			
				break;
		case 10: if(!s10.isEmpty())
				s10.remove(item);			
				break;
		default:
			break;
	}
	}
		public int[] getAll() {

			int[] a = new int[s0.size() + s1.size() + s2.size() + s3.size() + s4.size() + s5.size()
				+ s6.size() + s7.size() + s8.size() + s9.size() + s10.size()];
			int i = 0;
			while(!s0.isEmpty()) {
				a[i] = s0.pop(0);
				i++;
			}
			while(!s1.isEmpty()) {
				a[i] = s1.pop(0);
				i++;
			}
			while(!s2.isEmpty()) {
				a[i] = s2.pop(0);
				i++;
			}
			while(!s3.isEmpty()){
				a[i] = s3.pop(0);
				i++;
			}
			while(!s4.isEmpty()) {
				a[i] = s4.pop(0);
				i++;
			}
			while(!s5.isEmpty()) {
				a[i] = s5.pop(0);
				i++;
			}
			while(!s6.isEmpty()) {
				a[i] = s6.pop(0);
				i++;
			}
			while(!s7.isEmpty()) {
				a[i] = s7.pop(0);
				i++;
			}
			while(!s8.isEmpty()) {
				a[i] = s8.pop(0);
				i++;
			}
			while(!s9.isEmpty()) {
				a[i] = s9.pop(0);
				i++;
			}
			while(!s10.isEmpty()) {
				a[i] = s10.pop(0);
				i++;
			}
			return a;
	}*/
}
