package com.bridgelabz.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import com.bridgelabz.Utility.LinkedList.Node;
import com.bridgelabz.Utility.OrderedLinkedList.Node1;

public  class Utility {
	static Scanner s;

//Default Constructor to Creating object of scanner
	public Utility() 
	{
		s=new Scanner(System.in);
    }

// To return String Input
	public static String inputString()
	{
			return s.next();
	}
//To return String Input Line
	public static String inputStringLine()
	{
			return s.nextLine();
	}

//To return String Input
	public static long inputlong()
	{
			return s.nextLong();
	}
//To return Integer input
	public static int inputInt()
	{
			return s.nextInt();
		
	}

//To return Double input
	public static double inputDouble()
	{
			return s.nextDouble();
		
	}
//To accept Array of int
	public static Integer[] ArrayInt(int n)
	{
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
	}

//To acccept Generic Array
	public static String[] ArrayString(int n)
	{
		String a[] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		return a;
	}

//To Read File
	public static FileReader fileRead(String string) 
	{
		FileReader f = null;
		try {
			f = new FileReader(string);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;	
	}

//To write into file
	public static FileWriter fileWrite(String string) 
	{
		FileWriter f = null;
		try 
		{
			f = new FileWriter(string);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;	
	}
	
//Method to replace username
	public static String replaceString(String username)
	{
		int len=username.length();
		String str="Hello <<username>>, How are you?";
		if(len>3)
		{
			return str.replace("<<username>>", username);
		}
		else 
			return "Please Enter More than Three Character";
	}

//Method to flip the coin and print the percentile
	public static void flipCoin(int n)
	{
		int tail=0;int head=0;
		float tailPer=0;
		float headPer=0;
		if(n>0)
		{
			for(int i=0;i<n;i++)
			{
				if(Math.random()<0.5)
				{
					tail++;
					//System.out.println("tail");
				}
				else
					head++;
			}
			tailPer=((float)tail/n)*100;
			headPer=((float)head/n)*100;
			System.out.println("Tail Percent is:"+tailPer);
			System.out.println("Head Percent is"+headPer);
		}
		
	}

//Method to check Leap Year
	public static boolean isLeapOrNot(int year) 
	{
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Is a Leap Year");
			return true;
		}
		else
		{
			System.out.println("Is not a Leap Year");
			return false;
		}
		
	}
	
//Method to find Harmonic Year
	public static float harmonicValue(int n) 
	{	
		float sum=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+((float)1/i);
			}
		}
		return sum;
	}

//Method to find n prime factor
	public static void primeFactor(long n) 
	{
		for(long i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>1)
			System.out.println(n);
		else 
			System.out.println();
	}

//Method to find nth power of 2
	public static void powerOf2(int n) 
	{
		if(n>=0 && n<31)
		{
			int p=1;
			for(int i=0;i<=n;i++)
			{
				System.out.println("2^"+i+"="+p);
				p=2*p;
			}
		}
		
	}
	
//Method for gamblers
	public static void gambler(int stake,int goal,int times) {
		int win=0;
	
		for(int i=1;i<=times;i++)
		{	
			int money=stake;
			while(money>0 && money<goal)
			{
				if(Math.random()<0.5)
				{
					money++;
				}
				else
				{
					money--;
				}
				if(money==goal)
				{
					win++;
				}
			}
		}
		System.out.println("Times won:"+win);
		System.out.println("Percent of win:"+(win*100/times));
		System.out.println("Percent of loss:"+((times-win)*100/times));
	}
	
//Method for Distinct Coupon
	public static float random() 
	{
		return (float) Math.random()*9999;
	}
	public static void distinct(int n) 
	{
	boolean same= false;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			float value = random();
			for(int j=0;j<n;j++)
			{
				if(a[j]==value)
				{
					same=true;
					break;
					
				}
				if(same==false)
				{
					a[i]=(int) value;
				}
				
			}
	
		}
		System.out.println("Distinct Coupon number are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}


//Array Print
	public static void scanIn(int m, int n, int choice) {
		switch (choice) {
		case 1:
			    Integer intt[][]=new Integer[m][n];
			    System.out.println("Enter the Elements:");
			    for(int i=0;i<m;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		intt[i][j]=s.nextInt();
			    	}
			    }
			    
			    ArrayPrint(intt);
				break;
				
		case 2:
		    	Double doub[][]=new Double[m][n];
		    	 System.out.println("Enter the Elements:");
		    	for(int i=0;i<m;i++)
		    	{
		    		for(int j=0;j<n;j++)
		    		{
		    			doub[i][j]=s.nextDouble();
		    		}
		    	}
		    	 ArrayPrint(doub);
		    	break;
		
		case 3:
				Boolean boo[][]=new Boolean[m][n];
				 System.out.println("Enter the Elements:");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						boo[i][j]=s.nextBoolean();
					}
				}
				 ArrayPrint(boo);
				break;
		
		default:
				break;
		}
	}
	
//Printing Array 
	private static <P> void ArrayPrint( P[][] array) 
	{
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print((array[i][j]+" "));
			}
			System.out.println();
		}
	}

//Sum Of three Integer equals to zero
	public static void SumOfThree(int n, Integer[] a) 
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]+a[j]+a[k]==0)
					{
						count++;
						System.out.println("Number of Triplet:"+count);
						System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
					}
				}
			}
		}	
	}

//Method to Find Distance
	public static double distance(int x1, int y1) {
		//distance = sqrt(x*x + y*y)
		//√(x2  – x1)² + (y2 – y1)²
		int x=0, y=0;
		double distance=Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
		return distance;
	}
	
//Method for String Permutation
	public static void permute(String str) 
	{
		char s[]=str.toCharArray();
		Arrays.sort(s);
		for(int i=0;i<s.length;i++)
		{
			 if(s[i]<s[i+1])
			 {
				 swap(s[i],s[i+1]);
			 }
		}
	}
//swap
	private static void swap(char c, char d) 
	{
		char temp=c;
		c=d;
		d=temp;		
	}
	
//Method for StopWatch
	//start
	public static double time() {
		double time=System.currentTimeMillis();
		return time;
	}
	public static void stopWatch(double start,double end) {
	double timelapsed = ((end-start)/1000);
	System.out.println("Time elapsed is:"+timelapsed);
	}

//Method to find Quadratic roots
	public static void quadratic(int a, int b, int c) {
		double delta=(b*b) - (4*a*c);
		//System.out.println(delta);
		if(delta!=0)
		{
			int dsq=(int) Math.sqrt(delta);
			System.out.println(dsq);
			double x1=(double)(-b + dsq)/(2*a);
			double x2=(double)(-b - dsq)/(2*a);
			System.out.println("Roots of x is: ("+x1+","+x2+")");
		}
	}

//Method to Windchill
	public static void windchill(int t, int v) 
	{
		float vpow=(float) Math.pow(v, 0.16);
		double w=(35.74+0.6215*t+(0.4275*t-35.75)*vpow);
		System.out.println("Windmill:"+w);
	}
	
//Method for Anagram String
	public static void anagram(String str1, String str2) 
	{
		int stringLen1=str1.length();
		int stringLen2=str2.length();
		boolean status = false;
		if(stringLen1==stringLen2)
		{
			for(int i=0;i<stringLen1;i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						status=true;
					}
				}
			}
		}
		if(status==true)
		{
			System.out.println(str1+" , "+str2+" are Anagram Strings");
		}
		else
		{
			System.out.println(str1+" , "+str2+" are not Anagram Strings");
		}
	}

//Method for Prime Numbers
	public static int[] primeNumbers(int n) 
	{
		int k=0;
		int output[]=new int[n];
		int num;	
		//int len = 0;
		//int[] newarray;
		for(int i=1;i<=n;i++)
		{
			
			int count=0;
			num=i;
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				/*System.out.print(num);
				System.out.print(" ");*/
				output[k++]=num;
				//len++;
			}
		}
		
		/*newarray=new int[len];
		for(int i=0;i<len;i++)
		{
			if(output[i]!=0)
			{
				newarray[k]=output[i];
				k++;
			}
		}*/
		return output;
	}

//Method to display array
	public static void display(int array[]) 
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

//Method to find prime anagram
	public static void FindAnagram(int[] out) {
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				System.out.println(out[i]+" "+out[j]);
				AnagramInteger(out[i],out[j]);
			}
		}
		
	}
//Method for integer anagram
	public static void AnagramInteger(int n1, int n2) {
		long binary_a[]=new long[10];
		long binary_b[]=new long[10];
		int i=0;
		while(n1>0)
		{
			binary_a[i]=n1%2;
			n1/=2;
			i++;
		}
		int j=0;
		while(n2>0)
		{
			binary_b[j]=n2%2;
			n2/=2;
			j++;
		}
		Arrays.sort(binary_a);
		Arrays.sort(binary_b);
		if(binary_a==binary_b)
		{
			//System.out.println(n1+" "+n2+"is a angram");
		}
		else
		{
			//System.out.println(n1+" "+n2+"is not a angram");
		}
	}
	
//Method to find Palindrome
	public static void FindPalindrome(int out[])
	{
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			int r;int reverse = 0;
			int num=out[i];
			int temp=num;
			while(num>0)
			{    
				   r=num%10;   
				   reverse=(reverse*10)+r;    
				   num=num/10;
			}
			if(temp==reverse)
			{
				System.out.println(temp+"is Palindrome");
			}
		}
	}

	
//Method to search integer using binary search
	public static<T extends Comparable<T>> void BinarySearch(T[] array,T search) 
	{
		int length=array.length;
		int first=0;
		int last=length-1;
		int mid;
		
		while(first<=last)
		{	mid=(first+last)/2;
			if(array[mid].compareTo(search)<0)
			{
				first=mid+1;
			}
			else if(array[mid].compareTo(search)==0)
			{
				System.out.println(search+" found in location "+mid);
				break;
			}
			else if(array[mid].compareTo(search)>0)
			{
				last=mid-1;
			}
		}
		if(first > last)
		{
			System.out.println(search+"Not found");
		}
		
			
	}

//Method For Insertion Sort
	public static <T extends Comparable<T>> void insertionSort(T array[]) {
		int length=array.length;
		int j;
		T temp;
		for(int i=0;i<length;i++)
		{
			j=i;
			temp = array[i];
			while(j>0&&temp.compareTo(array[j-1])<0)
			{//
				array[j]=array[j-1];
				j=j-1;
			}
			array[j]=temp;//insert unsorted element
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}

//Method for Bubble Sort
	public static <T extends Comparable<T>> void bubbleSort(T array[]) {
		int length=array.length;
		
		
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(array[i].compareTo(array[j])>0)
				{
					T temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
//Method for merge sort
	public static <T extends Comparable<T>> void mergeSort (T a[] , int low , int high )
	{
		if(low < high) 
	    {
			int mid = (low + high )/2;
			mergeSort (a,low,mid);
			mergeSort (a,mid+1,high);             
	        merge(a,low,mid,high);   
	   }                    
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void merge(T a[] , int start, int mid, int end) 
	{
		 //stores the starting position of both parts in temporary variables.
		int p = start ,q = mid+1;
		Object[] arr1 = new Object[end-start+1];
		int k=0;
		for(int i = start ;i <= end ;i++) 
		{
			//checks if first part comes to an end or not .
			if(p>mid)      
		    {
		    	arr1[k++] = a[q++] ;
		    }
			//checks if second part comes to an end or not
			else if ( q > end)   
			{
			   arr1[k++] = a[p++];
			}
			//checks which part has smaller element.
			else if( a[p].compareTo(a[q])<0)     
			{
			   arr1[ k++ ] = a[p++];
			}
			else
			{
			   arr1[ k++ ] = a[q++];
			}
		}
		for (int l=0 ; l< k ;l ++)
		{
			  a[start++] = (T) arr1[l] ;                          
		}
		System.out.println("After Sorting:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

//Find Your Number
	public static void search(int first,int last) {
		int limit=(int) (Math.pow(2, 4)-1);
		int mid;
		mid=first+last/2;		
			if(first<limit)
			{
			
				System.out.println("Is your number between "+first+ " & "+mid);
				System.out.println("Yes or No?");
				String choice=inputString();
				if(choice.equals("yes"))
				{
					search(first,mid);
					
				}
				else if(choice.equals("no"))
				{	
					search(mid+1,last);
				}
			}
			else
		System.out.println(mid);
	}
	
//Binary Search Word List
	public static void findWord(FileReader file) 
	{
		BufferedReader bf=new BufferedReader(file);
		String string;
		String[] array = null;
		try {
			while((string=bf.readLine())!=null)
			{
				array=string.split(",");
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the word to search:");
		String search=Utility.inputString();
		Utility.BinarySearch(array, search);
	}

//Method for Merge Sort


//Method to find day of a week
	public static int dayOfWeek(int m, int d, int y) 
	{
		/*y0 = y − (14 − m) / 12
				x = y0 + y0/4 − y0/100 + y0/400
				m0 = m + 12 × ((14 − m) / 12) − 2
				d0 = (d + x + 31m0 / 12) mod 7*/
		int y1=y-(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=m + 12 * ((14 - m) / 12) - 2;
		int d1=(d+x+31*m1/12) % 7;
		//System.out.println(d1);
		return d1;
	}

//Method for Temperature Conversion
	public static void tempConvert(int choice, int temperature) 
	{
		/*Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
				Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
		 */
		int convert;
		
		switch(choice)
		{
		case 1:	convert=(temperature * 9/5)+32;
				System.out.println("After Conversation:"+convert);
				break;
		
		case 2: convert=(temperature-32)*5/9;
				System.out.println("After Conversation:"+convert);
				break;
		default: break;
		}	
	}
	
//Method to calculate Monthly Payment
	public static void monthlyPayment(double p,double r,int y) 
	{
		double n=y*12;
		double rate= r/(12*100);
		double payment;
		payment=(p*rate)/(1-Math.pow(1+rate,-n));
		System.out.println("Monthly Payment is:"+payment);
	}

//Method to find square root
	public static void sqrt(double c) 
	{
		double t=c;
		//t=((c/t)+t)/2;
		double epslion=1*Math.exp(-15);
		while(Math.abs(t-c/t)>epslion*t)
		{
			t=((c/t)+t)/2;
		}
		System.out.println("Square root of "+c+" is "+t);
		
	}

//Method to convert number into binary
	public static String toBinary(long num) 
	{
		
		String str="";
		int pow=1;
		while(pow<=num/2)
		{
			pow*=2;
		}
		while(pow>0)
		{
			if(num<pow)
			{
				str+=0;
			}
			else
			{
				str+=1;
				num-=pow;
			}
			pow=pow/2;
		}
		return str;
	}

//Method to return number of changes from vending machine
	public static void vendingMachine( int changes) 
	{
		    int notes[]={1, 2, 5, 10, 50, 100, 500, 1000};
			int len=notes.length;
			int count=0;
			for (int i = len-1; i >= 0; i--) 
			{
				while(changes>=notes[i])
				{
					changes-=notes[i];
					System.out.print(notes[i]+" ");
					count++;
				}

			}
			
			System.out.println("\nNumber of changes:"+count);
	}

//Method to swap nibbles
	public static void swapNibbles(String binary) 
	{
		
			if(binary.length()<8)
			{
				while (binary.length()<8)
				{
					binary = "0" + binary;
				}
			}
			System.out.println("Before Swapping Nibbles:"+binary);
			char arr[] = binary.toCharArray();
			for (int i=0;i<3;i++)
			{
				char ch = arr[i];
				arr[i]= arr[i+4];
				arr[i+4]= ch; 
			}
			binary = String.valueOf(arr);
			System.out.println("After Swapping Nibbles:"+binary);
			int c = Integer.parseInt(binary);
			int decimal = 0;
			int power = 0;
			// to convert binary to decimal
			while(true)
			{
				if(c == 0)
				{
					break;
				}
				else 
				{
					int tmp = c%10;
					decimal += tmp*Math.pow(2, power);
					c = c/10;
					power++;
				}
			}
			System.out.println("Number after Swapping Nibbles: " +decimal);
		}

//Method to balance expression
	public static void BalanceParanthesis(String exp) 
	{
		Stack s=new Stack();
		char e[]=exp.toCharArray();
		int explen=exp.length();
		int count1=0;int count2=0;
		for(int i=0;i<explen;i++)
		{
			if(e[i]=='(')
			{
				s.push(e[i]);
				count1++;
			}
			else if(e[i]==')')
			{
				s.pop();
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("Expression is valid");
		}
		else
		{
			System.out.println("Expression is invalid");
		}
	}

	
//Method for unorderlist
	@SuppressWarnings("unchecked")
	public static <N> LinkedList<N> readFileAndAddInList(String string) 
	{
		FileReader fileread=fileRead(string);
		BufferedReader br=new BufferedReader(fileread);
		String line;
		String array[]=null;
		LinkedList<N> list=new LinkedList<N>();
		try {
			while((line=br.readLine())!=null)
			{
				array=line.split(",");
			}
			for (int i = 0; i < array.length; i++) 
			{
				//System.out.println(array[i]);
				list.add((N) array[i]);
			}
			list.display();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public static <N> LinkedList<N> searchInList(LinkedList<N> list, String search)
	{
		list.search((N) search);
		list.display();
		return list;
	}
	public static <N> void readListWriteInFile(String string,LinkedList<N> list) 
	{
		try {
		FileWriter filewrite=fileWrite("/home/bridgeit/workspace/Files/LinklistWord");
		BufferedWriter bw=new BufferedWriter(filewrite);
		String str="";
		Node<N> temp=list.head;
		while(temp!=null)
		{
			str=str+" "+temp.data;
			temp=temp.next;
		}
			System.out.println(str);
			bw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Methods of ordered list
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static OrderedLinkedList searchInListOrder(OrderedLinkedList list, String search)
	{
		list.search(search);
		list.printList();
		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static OrderedLinkedList OrderreadFileAndAddInList(String string) {
		
		FileReader fileread=fileRead(string);
		BufferedReader br=new BufferedReader(fileread);
		String line;
		String array[]=null;
		OrderedLinkedList list=new OrderedLinkedList<String>();
		try {
			while((line=br.readLine())!=null)
			{
				array=line.split(",");
			}
			for (int i = 0; i < array.length; i++) 
			{
				System.out.println(array[i]);
				//System.out.println(array[i]);
				list.add(array[i]);
			}
	//	list.display();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static <N> void OrderreadListWriteInFile(String string,@SuppressWarnings("rawtypes") OrderedLinkedList list) 
	{
		try {
		FileWriter filewrite=fileWrite(string);
		BufferedWriter bw=new BufferedWriter(filewrite);
		String str="";
		@SuppressWarnings("unchecked")
		Node1<N> temp=list.head;
		while(temp!=null)
		{
			str=str+" "+temp.data;
			temp=temp.next;
		}
			System.out.println(str);
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//PalindromeCheck
	public static void isPalindromeChecker(String string) {
		Dequeue d= new Dequeue();
		boolean status=false;
		char[] array=string.toCharArray();
		char first;
		char last;
		for(int i=0;i<array.length;i++)
		{
			d.addRear(array[i]);
		}
		/*int size=d.size();
		System.out.println(size);*/
		while(d.size()>1)
		{
			first=d.removeFront();
			last=d.removeRear();
			System.out.println(first);
			System.out.println(last);
			if(first!=last)
			{
				status=false;
				break;
			}
			else
				status=true;
		}
		if(status==true)
		{
			System.out.println("Is a palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

//Method for Banking counter
	public static void bankCounter() 
	{
		Queue q=new Queue();
		System.out.println("Enter your choice:");
		System.out.println("1. To add in queue");
		System.out.println("2. To do transaction");
		int choice=inputInt();
		int option;
		double sum=0;
		while(choice==1 && q.size()<q.capacity)
		{
			
			q.enqueue(choice);
			System.out.println("Enter your choice:");
			System.out.println("1. To add in queue");
			System.out.println("2. To do transaction");
			option=inputInt();
			if(option==1)
				choice=option;
			else
				choice=option;
		}
		while(choice==2 && (q.size()<q.capacity))
		{
			if(q.isEmpty())
			{
				System.out.println("Please add into queue First");
				System.out.println("Enter your choice:");
				System.out.println("1. To add in queue");
				System.out.println("2. To do transaction");
				option=inputInt();
				if(option==1)
					q.enqueue(1);
				else
					choice=option;
			}
			else
			{
				System.out.println("Choose Your Transaction:");
				System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Add in queue again\n5.No. of ppl in queue");
				int select=Utility.inputInt();
			
				switch (select) {
				case 1: System.out.println("Enter Your Amount:");
						double amountdepo=inputDouble();
						sum=bankDeposit(amountdepo,sum);
						q.dequeue();
						break;
				case 2: System.out.println("Enter Your Amount:");
						double amountwith=inputDouble();
						sum=bankWithdraw(amountwith,sum);
						q.dequeue();
						break;
				case 3: System.out.println("Balance is:"+sum);
						break;
				case 4: q.enqueue(1);
						break;
				case 5: int size= q.size();
						System.out.println("Number of ppl in the queue are:"+size);
				default:
						break;
				}
			}
		}
	}
//Method to deposit
	static double bankDeposit(double amount,double sum)
	{
		System.out.println("Amount deposited is:"+amount);
		sum=sum+amount;
		System.out.println("Total amount"+sum);
		return sum;
	}
	
//Method to withdraw
	static double bankWithdraw(double amount,double sum)
	{
		System.out.println("Amount withdrawn is:"+amount);
		sum=sum-amount;
		System.out.println("Total amount"+sum);
		return sum;
	}
	
//Method for Calendar
	public static void Calendar(int month, int year) 
    {	
    	
        String[] months = {"January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if ((month == 2) && (isLeapOrNot(year))) 
        {
        	days[month] = 29;
        }
        
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println(" S  M Tu  W Th  F  St");
        int d = dayOfWeek(month, 1, year);
        
        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
        
        for (int i = 1; i <= days[month-1]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month-1])) 
            	System.out.println();
        } 
    }	
}
