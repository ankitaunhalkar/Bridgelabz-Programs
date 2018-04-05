package com.bridgelabz.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.Utility.LinkedList.Node;
import com.bridgelabz.Utility.OrderedLinkedList.MyNode;

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
//To return Boolean input;
    public static boolean inputBoolean()
    {
    return s.nextBoolean();   
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
            //
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
    public static <P> void ArrayPrint( P[][] array)
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
    public static void permute(String str,int l,int r)
    {
         if (l == r)
                System.out.println(str);
            else
            {
                for (int i = l; i <= r; i++)
                {
                    str = swap(str,l,i);
                    permute(str, l+1, r);
                    str = swap(str,l,i);
                }
            }
    }
//swap
    public static String swap(String str, int i,int j)
    {
            char charArray[]=str.toCharArray();
            char temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
           
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
    public static boolean Anagram(String str1, String str2)
    {
        char[] string1=str1.toCharArray();
        char[] string2=str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram =false;
        isAnagram = Arrays.equals(string1, string2);
        if(isAnagram==true)
        {
           //pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
        	 return isAnagram;
        }
        else
           //System.out.println(str1+" , "+str2+" are not Anagram Strings");
        	  return isAnagram;
       
    }
//To check number is prime or not
    public static boolean isPrime (int number) {
  
     for(int i=2; i<=number/2; i++){
         if(number % i == 0){
             return false;
         }
     }
     return true;
    }
//Method for Prime Numbers
    public static int[] primeNumbers(int n)
    {
            int a[]=new int[n];int k=0;
            for(int i=0;i<n;i++)
            {
                if(isPrime(i))
                {
                    a[k]=i;
                    k++;
                }
            }
            int len=0;
            for (int i=0; i<a.length; i++)
                {
                    if (a[i] != 0)
                        len++;
                }
               
                int [] newArray = new int[len];
                int j=0;
                for (int i=0; i<a.length; i++)
                {
                    if (a[i] != 0) {
                        newArray[j] = a[i];
                        j++;
                    }
                }
                System.out.println();
              
              /*  for (int integer : newArray) {
                    System.out.println(integer);
                } */
            return newArray;
           
       
    }

//Method to display array
    public static void display(int array[])
    {
       
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

//Method to find prime anagram
    public static boolean FindAnagram(int[] out) {
        int len=out.length;
       boolean status=false;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                //System.out.println(out[i]+" "+out[j]);
            status=	 AnagramInteger(out[i],out[j]);
           
            }
        }
       return status;
    }
//Method to display anagram
    public static void displayangaram(boolean status) {
		if(status)
		{
			System.out.println("Is Anagram");
		}
		else
			System.out.println("Is Not Anagram");
	}
//Method for integer anagram
    public static boolean AnagramInteger(int n1, int n2) {
   
        String num1=String.valueOf(n1);
        String num2=String.valueOf(n2);
       boolean status= Anagram(num1, num2);
       return status;
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
                System.out.println(temp+" is Palindrome");
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
        {    mid=(first+last)/2;
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
    public static int search(int low,int high) {
        if(low>high)
        {
            return -1;
        }
        else if(low==high)
        {
            return low;
        }
            int mid=(low+high)/2;
            System.out.println("Is you number between "+low+ " and "+mid);
            boolean flag=true;
            if(flag != Utility.inputBoolean() )
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        return search(low,high);
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
            e.printStackTrace();
        }
        System.out.println("Enter the word to search:");
        String search=Utility.inputString();
        Utility.BinarySearch(array, search);
    }


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
        case 1:    convert=(temperature * 9/5)+32;
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
            for (int i=0;i<4;i++)
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
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//Methods of ordered list
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static OrderedLinkedList searchInListOrder(OrderedLinkedList list, String search)
    {
        boolean status=list.search(search);
       
        if(status)
        {
            list.remove(search);
        }
        else
        {
            list.add(search);
        }
        list.list();
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
                //System.out.println(array[i]);
                list.add(array[i]);
            }
        list.list();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static <T> void OrderreadListWriteInFile(String string,@SuppressWarnings("rawtypes") OrderedLinkedList list)
    {
        try {
        FileWriter filewrite=fileWrite(string);
        BufferedWriter bw=new BufferedWriter(filewrite);
        String str="";
        @SuppressWarnings("unchecked")
        MyNode<T> temp=list.head;
       
        while(temp!=null)
        {
            str=str+" "+temp.data;
            temp=temp.next;
        }
            //System.out.println(str);
            bw.write(str);
            bw.flush();
            bw.close();
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
                        q.dequeue();
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
    public static double bankDeposit(double amount,double sum)
    {
        System.out.println("Amount deposited is:"+amount);
        sum=sum+amount;
        System.out.println("Total amount"+sum);
        return sum;
    }
   
//Method to withdraw
    public static double bankWithdraw(double amount,double sum)
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

//Method for Binary search Tree
    public static int findBTS(int num)
    {
        //(2n)!/(n+1)!*n!
        //2nCn
        int n=2*num;//2n
        int k=num;//n
        int value=1;
        int result=0;
         // [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
            for(int i=0;i<k;i++)
            {
                value*=(n-i);
                value/=(i+1);
            }
           
        // return 2nCn/(n+1)
        result=value/(num+1);
        return result;
    }
   
//Method for 2D Prime Array
    public static int[] Prime2D()
    {
        int[][] a=new int[10][30];
        int b[]=new int[250];
        int k=0;
        int c=0;
               
        while(c<250)
        {
            if(isPrime(k))
            {
                b[c]=k;
                c++;
            }
            k++;
        }
        int v=0;
        for(int i=0;i<10;i++)
        {
            int max=100;
            for(int j=0;j<30;j++)
            {
                if(b[v]<(i+1)*max)
                {
                    a[i][j]=b[v];
                    v++;
                }
            }
        }int start=0,end=1;
        for(int i=0;i<10;i++)
        {
        	end=(i+1)*100;
        	System.out.print("["+start+"-"+end+"]"); 
        	start=1+end;
                for(int j=0;j<30;j++)
                {   
                    if(a[i][j]>0)
                    {
                       
                        System.out.print(a[i][j]+"\t");   
                    }
                }
                System.out.println();
        }
        return b;
    }
//Method for 2D Prime Anagram
    public static int[][] PrimeAnagram2D() {
       int array[]=Prime2D();
       int n1=0;
       int n2=0;
       int k=0;
       boolean status=false;
       int newarray[] = new int[300];
       for(int i=0;i<array.length-1;i++)
       {
    	   for (int j = i+1; j < array.length; j++)
    	   {
    		   n1=array[i];
    		   n2=array[j];
    		   status=AnagramInteger(n1, n2);
    		   if(status==true)
    		   {
    			   newarray[k++]=n1;
    			   newarray[k++]=n2;
    			   
    		   }
    	   }
       }
       int v=0;
       int a[][]=new int[10][30];
       for(int i=0;i<10;i++)
       {
           int max=100;
           for(int j=0;j<30;j++)
           {
               if(array[v]<(i+1)*max)
               {
                   a[i][j]=newarray[v];
                   v++;
               }
           }
       }
       System.out.println("-------------------------------");
       System.out.println("Prime Numbers that are Anagram");
       System.out.println("-------------------------------");
       for(int i=0;i<10;i++)
       {    
               for(int j=0;j<30;j++)
               {   
                   if(a[i][j]>0 && a[i][j]<1000)
                   {
                      
                       System.out.print(a[i][j]+"\t");   
                   }
               }
               System.out.println();
       }
       return a;
    }
 
 //Method for Prime Anagram in Stack
    public static void StackPrimeAnagram() {
    	
		int array[][]=PrimeAnagram2D();
		StackLinkList stack=new StackLinkList();
		System.out.println("----------------------------------");
		System.out.println("Prime Anagram in reverse order using Stack");
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 30; j++) 
			{
				 if(array[i][j]>0 && array[i][j]<1000)
                 {
                    stack.insert(array[i][j]+"\t");
                     //System.out.print(a[i][j]+"\t");   
                 }
				
			}
			 stack.insert("\n");
		}
		stack.display();
	}
 
 //Method for Prime Anagram in Queue
public static void QueuePrimeAnagram() {
    	
		int array[][]=PrimeAnagram2D();
		QueueLinkList queue=new QueueLinkList();
		System.out.println("----------------------------------");
		System.out.println("Prime Anagram using Queue");
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 30; j++) 
			{
				 if(array[i][j]>0 && array[i][j]<1000)
                 {
                    queue.insert(array[i][j]+"\t");
                     //System.out.print(a[i][j]+"\t");   
                 }
				
			}
			 queue.insert("\n");
		}
		queue.display();
	}
    
//Method for CalendarQueue
    public static void CalendarQueue(int month,int year)
    {
        QueueLinkList weekday=new QueueLinkList();
        String[] months = {"January", "February", "March","April", "May", "June",
                "July", "August", "September","October", "November", "December"};

            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if ((month == 2) && (isLeapOrNot(year)))
            {
                days[month] = 29;
            }
            System.out.println("\t\t\t" + months[month-1] + " " + year);
            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
            int d = dayOfWeek(month, 1, year);
            for(int i=0;i<d;i++)
            {
                weekday.insert("\t");
            }
            for (int i = 1; i <= days[month-1]; i++)
            {
                //System.out.printf("%2d ", i);
                weekday.insert("\t"+i);
                if (((i + d) % 7 == 0) || (i == days[month-1]))
                weekday.insert("\n");
            }
            weekday.display();
    }
   
//Method for Calendar Stack
    public static void CalendarStack(int month,int year) {
        StackLinkList weekdayIn=new StackLinkList();
        StackLinkList weekdayOut=new StackLinkList();
        String[] months = {"January", "February", "March","April", "May", "June",
                "July", "August", "September","October", "November", "December"};

            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if ((month == 2) && (isLeapOrNot(year)))
            {
                days[month] = 29;
            }
            System.out.println("\t\t\t" + months[month-1] + " " + year);
            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
            int d = dayOfWeek(month, 1, year);
            for(int i=0;i<d;i++)
            {
                  weekdayIn.insert("\t");
                 
            }
            weekdayIn.display();
           for(int i=0;i<d;i++)
           {
               weekdayOut.insert(weekdayIn.delete());
              
           }
            for (int i = 1 ; i <=days[month-1] ; i++)
            {
                weekdayIn.insert("\t"+i);
                if (((i + d) % 7 == 0) || (i == days[month-1]))    
                    weekdayIn.insert("\n");
             }
           for(int i=1;i<=days[month-1] ; i++)
           {
               weekdayOut.insert(weekdayIn.delete());
           
           }
            weekdayOut.display();
    }
   
//Method for Inventory Data Management
    public static void inventory(FileReader fileread) throws IOException, ParseException {
            JSONParser parse=new JSONParser();
            JSONObject object=(JSONObject) parse.parse(fileread);
            //System.out.println(object);
            Iterator<?> iterator=object.keySet().iterator();//Keys of Object(rice,wheat,pulses)
            while(iterator.hasNext())
            {
                String topkey=(String)iterator.next();
                JSONObject obj=(JSONObject) object.get(topkey);
                Iterator<?> iterate = obj.keySet().iterator();//keys of each specific object
                while(iterate.hasNext())
                {
                    String key=(String) iterate.next();
                    System.out.println(key+":"+obj.get(key));
                }
                Integer amount=(Integer.parseInt(obj.get("Price").toString())) * (Integer.parseInt(obj.get("Weight").toString()));
                System.out.println("The total cost of "+obj.get("Name")+" is: "+amount);
                System.out.println();
            }
    }


//Method for regular Expression
    public static void regularExpression(String firstname, String lastname, String mobile)
    {
        String message="Hello <<name>>, We have your full name as <<full name>> in our system.\n" +
                "Your contact number is 91-XXXXXXXXXX. Please,let us know in case of any\n" +
                "clarification.\nThank you BridgeLabz XX/XX/XXXX .";   
        Date d=new Date();
        String date=new SimpleDateFormat().format(d);
        String name=firstname+" "+lastname;
        message=message.replace("<<name>>", firstname);
        message=message.replace("<<full name>>", name);
        message=message.replace("XXXXXXXXXX", mobile);
        message=message.replace("XX/XX/XXXX", date);
        System.out.println(message);
    }

//Method for Stock Report
    public static void stockReport(FileReader fileread) throws IOException, ParseException
    {
        JSONParser parse=new JSONParser();
       
        int total = 0;
        JSONObject object=(JSONObject) parse.parse(fileread);
        //System.out.println(object);
        Iterator<?> iterator=object.keySet().iterator();
        while(iterator.hasNext())
        {
            String topkey=(String)iterator.next();
            JSONObject obj=(JSONObject) object.get(topkey);
            System.out.println("Company name:"+topkey);
            long price=(Long) obj.get("Price");
            long num=(Long) obj.get("NumShare");
            total+=price*num;
            System.out.println("Price:"+price);
            System.out.println("Number Of Shares:"+num);
            System.out.println("Total Stock is:"+price*num);
            System.out.println();
        }
        System.out.println("Total amount of shares is:"+total);
    }

//Method for Inventory Management
    public static void inventoryManage(FileReader fileread) throws IOException, ParseException {
        JSONParser parse=new JSONParser();
        JSONObject object=(JSONObject) parse.parse(fileread);
        //System.out.println(object);
        int total=0;
        Iterator<?> iterator=object.keySet().iterator();//Keys of Object(rice,wheat,pulses)
        while(iterator.hasNext())
        {
            String topkey=(String)iterator.next();
            JSONObject obj=(JSONObject) object.get(topkey);
            Iterator<?> iterate = obj.keySet().iterator();//keys of each specific object
            while(iterate.hasNext())
            {
                String key=(String) iterate.next();
                System.out.println(key+":"+obj.get(key));
            }
            Integer amount=(Integer.parseInt(obj.get("Price").toString())) * (Integer.parseInt(obj.get("Weight").toString()));
            System.out.println("The total cost of "+obj.get("Name")+" is: "+amount);
            System.out.println();
            total=total+amount;       
    }
        System.out.println("The total Amount of inventory is:"+total);
    }

//Method for Commercial data Processing
    public static void StockAccount() throws IOException, ParseException
    {
        System.out.println("Enter Your Chocie");
        System.out.println("1.Create a new Account\n2.Buy Shares\n3.Sell Shares\n4.Print Report");
        int choice=Utility.inputInt();
        switch(choice)
        {
        case 1: System.out.println("Creating Account");
                createAcc();
                break;
        case 2: System.out.println("You are buying Shares");
                buyShare();
                break;
        case 3: System.out.println("You are selling shares");
                sellShare();
                break;
        case 4: System.out.println("Print Report");
                 printReport();
                 break;
        default: break;
        }
       
    }

    @SuppressWarnings("unchecked")
    public static void sellShare() throws IOException, ParseException
    {
        File file = new File("/home/bridgeit/workspace/Files/customerShare.json");
        File file1 =new File("/home/bridgeit/workspace/Files/companyStock.json");
        if(file.exists() && file1.exists())
        {
            //Scanner scan = new Scanner(System.in);
            // reading stock file
            FileReader fr = new FileReader(file);
            JSONParser parser = new JSONParser();
            JSONArray stock = (JSONArray) parser.parse(fr);
            //reading share file
           
            FileReader sf = new FileReader(file1);
            JSONParser parser1 = new JSONParser();
            JSONArray share = (JSONArray) parser1.parse(sf);
           
            System.out.println("Enter the user");
            String name = inputString();
            Iterator<?> itr = stock.iterator();
            Iterator<?> itr1 = share.iterator();
            boolean flag = false;
            while (itr.hasNext())
            {
                JSONObject obj=(JSONObject) itr.next();
                if(obj.get("Name").equals(name))
                {
                    System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
                    String sym = inputString();
                    System.out.println("Enter the number of share to sale");
                    int count= inputInt();
                    //obj.put("Share Symbol", sym);
                    while(itr1.hasNext())
                    {
                        JSONObject obj1 = (JSONObject) itr1.next();
                        if(obj1.get("Symbol").equals(sym))
                        {   
                            int bal =  Integer.parseInt(obj.get("Balance").toString());
                            int price = Integer.parseInt(obj1.get("Price").toString());
                            int noShare =  Integer.parseInt(obj.get("ShareCount").toString());
                            int stockShare = Integer.parseInt(obj1.get("Count").toString());
                            int saleprize = count*price;
                            int newbal = bal+saleprize;
                            int sharecountcus = noShare-count;
                            
                            int sharecountstock = stockShare+count;
                            if(sharecountcus>0 && noShare>0)
                            {
                            obj.remove("Balance");
                            obj.remove("ShareCount");
                            obj1.remove("Count");
                            obj.put("Balance",newbal);
                            obj.put("ShareCount",sharecountcus);
                            obj1.put("Count", sharecountstock);
                            }
                            else
                            {
                            	System.out.println("No Shares Available");
                            }
                            Date d = new Date();
                            String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
                            System.out.println("Date "+date);
                            flag = true;
                            break;
                        }
                       
                    }
                }

                FileWriter fs = new FileWriter(file);
                fs.write(JSONValue.toJSONString(stock));
                fs.flush();
                fs.close();
            }
            if(flag == false)
            {
                System.out.println("User name not exits");
            }
            FileWriter fw = new FileWriter(file1);
            fw.write(JSONValue.toJSONString(share));
            fw.flush();
            fw.close();
        }
        else
        {
            System.out.println("File Does not exits");
        }
        StockAccount();
    }

   
    @SuppressWarnings("unchecked")
    public static void buyShare() throws IOException, ParseException
    {
        File file = new File("/home/bridgeit/workspace/Files/customerShare.json");
        File file1 =new File("/home/bridgeit/workspace/Files/companyStock.json");
        if(file.exists() && file1.exists())
        {
           
            // reading stock file
            FileReader fr = new FileReader(file);
            JSONParser parser = new JSONParser();
            JSONArray stock = (JSONArray) parser.parse(fr);
            //reading share file
           
            FileReader sf = new FileReader(file1);
            JSONParser parser1 = new JSONParser();
            JSONArray share = (JSONArray) parser1.parse(sf);
           
            System.out.println("Enter the user");
            String name = inputString();
            Iterator<?> itr = stock.iterator();
            Iterator<?> itr1 = share.iterator();
            boolean flag = false;
            while (itr.hasNext())
            {
                JSONObject obj=(JSONObject) itr.next();
                if(obj.get("Name").equals(name))
                {
                    System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
                    String sym = inputString();
                    /*obj.put("Share symbol", sym);
                    if(obj.get("Share Symbol").equals(sym))
                    {*/
                        while(itr1.hasNext())
                        {
                            JSONObject obj1 = (JSONObject) itr1.next();
                            if(obj1.get("Symbol").equals(sym))
                            {   
                                System.out.println("Enter the amount");
                                int amt= inputInt();
                                int bal =  Integer.parseInt(obj.get("Balance").toString());
                                
                                int price = Integer.parseInt(obj1.get("Price").toString());
                    
                                int noShare =  Integer.parseInt(obj.get("ShareCount").toString());
                                
                                int stockShare = Integer.parseInt(obj1.get("Count").toString());
                                int numofshare = amt/price;
                                
                                int newbal = bal-amt;
                                int sharecountcus = noShare+numofshare;
                                int sharecountstock = stockShare-numofshare;
                                
                                obj.remove("Balance");
                                obj.remove("ShareCount");
                                obj1.remove("Count");
                               
                                obj.put("Balance",newbal);
                                obj.put("ShareCount",sharecountcus);
                                obj1.put("Count", sharecountstock);
                                Date d = new Date();
                                String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
                                System.out.println("Date "+date);
                                flag= true;
                                break;
                            }
                        }
                   
                }
                FileWriter fs = new FileWriter(file);
                fs.write(JSONValue.toJSONString(stock));
                fs.flush();   
                fs.close();
            }
            if(flag == false)
            {
                System.out.println("User name not exits");
            }
            FileWriter fw = new FileWriter(file1);
            fw.write(JSONValue.toJSONString(share));
            fw.flush();
            fw.close();
        }
        else
        {
            System.out.println("File does not exits");
        }
        StockAccount();
    }

    @SuppressWarnings("unchecked")
    public static void createAcc() throws IOException, ParseException
    {
        File file = new File("/home/bridgeit/workspace/Files/customerShare.json");
        if(file.exists())
        {
           
            boolean check= true;
            while (check==true)
            {   
                System.out.println("Want to add user: yes or no");
                String ch = inputString();
                if(ch.equals("yes"))
                {   
                   
                    FileReader fr = new FileReader(file);
                    JSONParser parser = new JSONParser();
                    JSONArray arr1 = (JSONArray) parser.parse(fr);
                    JSONObject json = new JSONObject();
                    System.out.println("Enter name");
                    String name = inputString();
                    System.out.println("Enter balance");
                    int bal = inputInt();
                    json.put("Name",name);
                    json.put("Balance",bal);
                    json.put("ShareCount",100);
               
                    arr1.add(json);
                    FileWriter fw = new FileWriter(file);
                    fw.write(JSONArray.toJSONString(arr1));
                    fw.flush();
                    fw.close();
       
                }
                else
                {
                    check=false;
                }
            }
           
        }
        else
        {
            System.out.println("File does not exits");
        }
        StockAccount();
    }
    public static void printReport() throws IOException, ParseException {
        FileReader file=fileRead("/home/bridgeit/workspace/Files/customerShare.json");   
        JSONParser parser=new JSONParser();
        JSONArray shareArray=(JSONArray)parser.parse(file);
        Iterator<?> iterator=shareArray.iterator();
        while(iterator.hasNext())
        {
            JSONObject shareobj=(JSONObject) iterator.next();
            System.out.println(shareobj);
        }
       
}

//Methods for address book
    public static void addressBook() throws IOException, ParseException {
        System.out.println("Enter the choice:\n1.Add\n2.Edit\n3.Delete\n4.Sort");
        int choice=Utility.inputInt();
        switch (choice) {
        case 1:addAddress();
            break;
           
        case 2:editAddress();
            break;
           
        case 3:deleteAddress();
            break;
       
        case 4:sortAddress();
            break;
        default:
            break;
        }
    }
    public static class Sort implements Comparator<Object> 
	{
		String str ;
		public Sort(String str) 
		{
			this.str =str;
		}
	
		public int compare(Object o1, Object o2) 
		{
			JSONObject obj1=(JSONObject)o1;  
			JSONObject obj2=(JSONObject)o2;  
			return (obj1.get(str).toString()).compareTo(obj2.get(str).toString());
		}
	
	}
    @SuppressWarnings("unchecked")
	public static void sortAddress() throws IOException, ParseException {
        FileReader fr = new FileReader("/home/bridgeit/workspace/Files/AddressBook.json");
        JSONParser parser=new JSONParser();
        JSONArray array=(JSONArray) parser.parse(fr);

       
        System.out.println("Enter the attribute name through which you want sort:");
       String attribute=inputString();
       
       Collections.sort(array,new Sort(attribute));
		Iterator<?> itr=array.iterator(); 
		while (itr.hasNext())
		{
			JSONObject obj1 = (JSONObject) itr.next();
			System.out.println("First Name : "+obj1.get("Firstname")+" "+"Last Name : "+obj1.get("Lastname")+" "+"Address: "+obj1.get("Address")+" "+"City : " +obj1.get("City")+" "+"State : "+obj1.get("State")+" "
					+"Zip: "+obj1.get("Zip")+" "+"Mobile: "+obj1.get("Mobile"));
		}
		FileWriter fw = new FileWriter("/home/bridgeit/workspace/Files/AddressBook.json");
       fw.write(JSONArray.toJSONString(array));
       fw.flush();
       fw.close();

    }

    public static void deleteAddress() throws IOException, ParseException {
        FileReader fr = new FileReader("/home/bridgeit/workspace/Files/AddressBook.json");
        JSONParser parser=new JSONParser();
        JSONArray array=(JSONArray) parser.parse(fr);

       
        System.out.println("Enter your First name To delete:");
        String name=inputString();
       
        Iterator<?> iterate=array.iterator();
        while(iterate.hasNext())
        {
            JSONObject obj=(JSONObject) iterate.next();
            if(name.equals(obj.get("Firstname")))
            {
                System.out.println(obj);
                array.remove(obj);
                System.out.println("Address show above is deleted");
                break;
            }
        }
        
         FileWriter fw=fileWrite("/home/bridgeit/workspace/Files/AddressBook.json");
         fw.write(JSONValue.toJSONString(array));
         fw.flush();
         fw.close();
    }

    @SuppressWarnings("unchecked")
    public static void editAddress() throws IOException, ParseException {

        FileReader fr = new FileReader("/home/bridgeit/workspace/Files/AddressBook.json");
        JSONParser parser=new JSONParser();
        JSONArray array=(JSONArray) parser.parse(fr);
               
        System.out.println("Enter your First name To Edit:");
        String name=inputString();
       
        Iterator<?> iterate=array.iterator();
        while(iterate.hasNext())
        {
           
            JSONObject object=(JSONObject) iterate.next();
            if(name.equals(object.get("Firstname")))
            {
                System.out.println(object);
               
                System.out.println("What you want to edit?");
                String attribute=inputString();
               
                object.remove(attribute);
               
                System.out.println("Enter your new value:");
                String value=inputString();
               
                object.put(attribute, value);
               
                System.out.println(object);
            }
        }
         FileWriter fw=fileWrite("/home/bridgeit/workspace/Files/AddressBook.json");
         fw.write(JSONValue.toJSONString(array));
         fw.flush();
         fw.close();
    }

    @SuppressWarnings("unchecked")
    public static void addAddress() throws IOException, ParseException {
       
        FileReader fr = new FileReader("/home/bridgeit/workspace/Files/AddressBook.json");
        JSONParser parser=new JSONParser();
        JSONArray array=(JSONArray) parser.parse(fr);
        JSONObject person=new JSONObject();
       
        System.out.println("Enter First Name:");
        String firstname=inputString();
        System.out.println("Enter Last Name:");
        String lastname=inputString();
        System.out.println("Enter Address:");
        String address=inputString();
        System.out.println("Enter City:");
        String city=inputString();
        System.out.println("Enter State:");
        String state=inputString();
        System.out.println("Enter Zip:");
        String zip=inputString();
        System.out.println("Enter Phone Number:");
        String phone=inputString();
       
         person.put("Firstname", firstname);
         person.put("Lastname", lastname);
         person.put("Address", address);
         person.put("City", city);
         person.put("State", state);
         person.put("Zip", zip);
         person.put("Phone", phone);
         array.add(person);
         System.out.println("Added SuccuessFully");   
       
         //writing to file
         FileWriter fw=fileWrite("/home/bridgeit/workspace/Files/AddressBook.json");
         fw.write(JSONValue.toJSONString(array));
         fw.flush();
         fw.close();
         
         addressBook();
    }

    public static void cliniqueManagement() throws IOException, ParseException {
        System.out.println("Welcome to Clinique Management");
        System.out.println("Press the number, you would like to choose!");
        System.out.println("1.Add Doctor\n2.Add Patient\n3.Search Doctor\n4.Search Patient\n5.Book Appointment" +
                "\n6.Show Patient\n7.Show Doctor\n8.Show Appointment\n9.Exit\n");
        int choice=inputInt();
        switch (choice) {
        case 1: addDoctor();
                break;
        case 2: addPatient();
                break;
        case 3: searchDoctor();
                break;
        case 4: searchPatient();
                break;
        case 5: bookAppointment();
                break;
        case 6: showPatient();
                break;
        case 7: showDoctor();
                break;
        case 8: showAppointment();
                break;
        case 9: 
            break;
        }
    }
    public static void showAppointment() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Appointment.json");
        JSONParser parser=new JSONParser();
        JSONArray appArray=(JSONArray) parser.parse(fr);
       
        Iterator<?> iterate=appArray.iterator();
        while (iterate.hasNext()) {
            JSONObject app=(JSONObject) iterate.next();
            System.out.println(app);
        }
        cliniqueManagement();
    }

    public static void showDoctor() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Doctor.json");
        JSONParser parser=new JSONParser();
        JSONArray docArray=(JSONArray) parser.parse(fr);
       
        Iterator<?> iterate=docArray.iterator();
        while (iterate.hasNext()) {
            JSONObject doctor=(JSONObject) iterate.next();
            System.out.println(doctor);
        }
        cliniqueManagement();
    }

    public static void showPatient() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Patient.json");
        JSONParser parser=new JSONParser();
        JSONArray patArray=(JSONArray) parser.parse(fr);
       
        Iterator<?> iterate=patArray.iterator();
        while (iterate.hasNext()) {
            JSONObject patient=(JSONObject) iterate.next();
            System.out.println(patient);
        }
        cliniqueManagement();
    }

    @SuppressWarnings("unchecked")
    public static void addDoctor() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Doctor.json");
        JSONParser parser=new JSONParser();
        JSONArray docArray=(JSONArray) parser.parse(fr);
        JSONObject doctor=new JSONObject();
        System.out.println("Enter doctor name:");
        String dname=inputString();
        System.out.println("Enter doctor id:");
        String did=inputString();
        System.out.println("Enter doctor specialization:");
        String dspecial=inputString();
        System.out.println("Enter doctor Availability time:");
        String davailable=inputString();
        System.out.println("Enter doctor Availability date:");
        String date=inputString();
        
        doctor.put("Name", dname);
        doctor.put("ID", did);
        doctor.put("Specialize",dspecial);
        doctor.put("Available", davailable);
        doctor.put("Count", 0);
        doctor.put("Date", date);
        docArray.add(doctor);
        System.out.println("Doctor is Added Sucessfully");
       
        System.out.println(doctor);
        //writing to file
        FileWriter fw=fileWrite("/home/bridgeit/workspace/Files/Doctor.json");
         fw.write(JSONValue.toJSONString(docArray));
         fw.flush();
         fw.close();
        cliniqueManagement();
    }
   
    @SuppressWarnings("unchecked")
    public static void addPatient() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Patient.json");
        JSONParser parser=new JSONParser();
        JSONArray patArray=(JSONArray) parser.parse(fr);
        JSONObject patient=new JSONObject();
       
        System.out.println("Enter patient name:");
        String pname=inputString();
        System.out.println("Enter patient id:");
        String pid=inputString();
        System.out.println("Enter patient mobile number:");
        String mobile=inputString();
        System.out.println("Enter patient age");
        String age=inputString();
        
        patient.put("Name", pname);
        patient.put("ID", pid);
        patient.put("Mobile", mobile);
        patient.put("Age", age);
        patArray.add(patient);
        System.out.println("Patient is Added Sucessfully");
       
        System.out.println(patient);
        //writing to file
        FileWriter fw=fileWrite("/home/bridgeit/workspace/Files/Patient.json");
         fw.write(JSONValue.toJSONString(patArray));
         fw.flush();
         fw.close();
         
        cliniqueManagement();
       
    }
    public static void searchDoctor() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Doctor.json");
        JSONParser parser=new JSONParser();
        JSONArray docArray=(JSONArray) parser.parse(fr);
       
        System.out.println("Search doctor either by ID/Specialization/Name/Availablility");
        System.out.println("Enter the field name you want to search in:");
        String field=inputString();
        System.out.println("Enter the value for selected field");
        String value=inputString();
        Iterator<?> iterator=docArray.iterator();
        while (iterator.hasNext()) {
            JSONObject object = (JSONObject) iterator.next();
                if(value.equals(object.get(field)))
                {
                    System.out.println(object);
                }
        }
        cliniqueManagement();
    }

    public static void searchPatient() throws IOException, ParseException {
        FileReader fr= fileRead("/home/bridgeit/workspace/Files/Patient.json");
        JSONParser parser=new JSONParser();
        JSONArray patArray=(JSONArray) parser.parse(fr);
       
        System.out.println("Search Patient either by ID/Age/Name/Mobile");
        System.out.println("Enter the field name you want to search in:");
        String field=inputString();
        System.out.println("Enter the value for selected field:");
        String value=inputString();
       
        Iterator<?> iterator=patArray.iterator();
        while (iterator.hasNext()) {
            JSONObject object = (JSONObject) iterator.next();
                if(value.equals(object.get(field)))
                {
                    System.out.println(object);
                }
        }
        cliniqueManagement();
    }
    @SuppressWarnings("unchecked")
    public static void bookAppointment() throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        //Doctor
        FileReader docfile= fileRead("/home/bridgeit/workspace/Files/Doctor.json");
        JSONArray docArray=(JSONArray) parser.parse(docfile);
        JSONObject doctor = null;
       
        //Patient
        FileReader patfile= fileRead("/home/bridgeit/workspace/Files/Patient.json");
        JSONArray patArray=(JSONArray) parser.parse(patfile);
        //Appointment
        FileReader appointfile= fileRead("/home/bridgeit/workspace/Files/Appointment.json");
        JSONArray appointArray=(JSONArray) parser.parse(appointfile);
        JSONObject appoint=new JSONObject();
       
        System.out.println("Enter Patient ID:");
        String pid=inputString();
       
        System.out.println("Enter the Appointment Date:");
        String date=inputString();
        
        Iterator<?> iterator=patArray.iterator();
        while(iterator.hasNext())
        {
            JSONObject patient=(JSONObject) iterator.next();
            if(pid.equals(patient.get("ID")))
            {
                System.out.println("Enter the doctor name:");
                String dname=inputString();
                Iterator<?> iterator2=docArray.iterator();
                while(iterator2.hasNext())
                {
                    doctor=(JSONObject) iterator2.next();
                    if(dname.equals(doctor.get("Name")))
                    {
                    	if(date.equals(doctor.get("Date")))
                    	{
                    		int dcount=Integer.parseInt(doctor.get("Count").toString());
                    		if(dcount<5)
                    		{
                    			appoint.put("PID", pid);
                    			appoint.put("DName", dname);
                    			appoint.put("ADate", date);
                    			appointArray.add(appoint);
                    			System.out.println(appoint);
                    	   
                    			dcount++;
                    			doctor.remove("Count");
                    			doctor.put("Count", dcount);
                    			System.out.println(doctor);
                    			
                    			FileWriter appointwrite=fileWrite("/home/bridgeit/workspace/Files/Appointment.json");
                    	        appointwrite.write(JSONValue.toJSONString(appointArray));
                    	        appointwrite.flush();
                    	        appointwrite.close();
                    	       
                    	        FileWriter doctorwrite=fileWrite("/home/bridgeit/workspace/Files/Doctor.json");
                    	        doctorwrite.write(JSONValue.toJSONString(docArray));
                    	        doctorwrite.flush();
                    	        doctorwrite.close();
                    		}
                    		else
                    		{
                    			System.out.println("Doctor is not avaiable! Please Add In tomorrow");
                    		}
                    	}
                    	else
                    	{
                    		System.out.println("Doctor is not avaliable on this date!");
                    	}
                    }
                }
            }
        }
        
        cliniqueManagement();
    }

    public static void deckOfCard() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
       
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        String array [][] = new String[4][9];
       
        // initialize deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++)
        {
        	
            for (int j = 0; j < suits.length; j++)
            {
            	
                deck[suits.length*i + j] = ranks[i] + "->" + suits[j];
            }
        }
   
        // shuffle
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            //System.out.println(r);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
      // print shuffled deck
   
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j <9; j++)
            {
                array[i][j]=(deck[i + j * 4]);
            }
        }
       
        for(int i=0;i<array.length;i++)
        {System.out.println("Player:"+(i+1));
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
	}
   

        

		
    public static void  hashFunction() throws NumberFormatException, IOException
    {
        HashMap<Integer, OrderedLinkedList<Integer>> hashMap= new HashMap<Integer, OrderedLinkedList<Integer>>();
       
        intializeHash(hashMap);
      
        readHashFile(hashMap);

        searchHashNumber(hashMap);  

    }

    public static void display(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) 
    {   
    	Set<Integer> keys = hashMap.keySet();
    	 System.out.println();
    	 
        for (Integer key : keys) {
        	OrderedLinkedList<Integer> value=hashMap.get(key);
            System.out.print(key +"-->");
            value.list();
            System.out.println();
        }
	}
    
    public static void searchHashNumber(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) throws FileNotFoundException, UnsupportedEncodingException {
       
        System.out.print("Enter a number to search: ");
        int search = inputInt();    //    number to be searched
       
        //    getting list in which the number should be
        OrderedLinkedList<Integer> list = hashMap.get(search % 11);
       
        if(list.search(search))
        {    //    file contains the number
            System.out.println("File contains number. Removing it.");
            list.remove(search);
       
        }
        else
        {    //    file does not contain the number
            System.out.println("File does not contain the number. Adding it to the file.");
            list.add(search);
           
        }
        display(hashMap);
        PrintWriter printWriter = null;    // to write to the file
        printWriter = new PrintWriter("/home/bridgeit/workspace/Files/listhwrite" , "UTF-8");
            for(int i = 0; i < 11; i++)
            {
            list = hashMap.get(i);    //    getting lists
           // System.out.println(list);
            while(!list.isEmpty())
            {
                //    popping every element and adding to the file
            	Integer str=list.pop(0);
            	System.out.print(str+"\t");
                printWriter.print(str+"\t");
            }           
        }       
            printWriter.close();
          
    }

    public static void readHashFile(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) throws NumberFormatException, IOException {
        FileReader fileread=fileRead("/home/bridgeit/workspace/Files/listh");
        BufferedReader br=new BufferedReader(fileread);
        String line;
        while((line=br.readLine())!=null)
        {
            String[] strings = line.split(",");    //    splits line into string array
            for(String integers : strings)
            {
                //    converts string into integer
                int numberToAdd = Integer.parseInt(integers);
                //    adds number to appropriate list
                OrderedLinkedList<Integer> list = hashMap.get(numberToAdd % 11);
                list.add(numberToAdd);
                list.list();
            }
        }
        display(hashMap);
        
    }

    public static void intializeHash(HashMap<Integer, OrderedLinkedList<Integer>> hashMap)
    {
        for(int i=0;i<11;i++)
        {
            hashMap.put(i, new OrderedLinkedList<Integer>());
        }
        
    }

    public static void deckOfCardQueue() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        String array [][] = new String[4][9];
        QueueLinkList q=new QueueLinkList();
        // initialize deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                deck[suits.length*i + j] = ranks[i] + "->" + suits[j];
            }
        }
   
        // shuffle
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
     
        // print shuffled deck
   
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                array[i][j]=deck[i + j * 4];
                q.insert(array[i][j]+"\t");
              
            }
            q.insert("\n");
        }
        q.display();
        SortDeck(array,q);
    }  
    public static void SortDeck(String [][]array,QueueLinkList q) {

		char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
		String[] cards=new String[51];
		for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                cards[j]=array[i][j];
               // System.out.print(cards[j]);
              
            }
        }
		String card;
			for (int i = 0; i < rank.length; i++) 
			{
			for (int j = 0; j < cards.length; j++) 
			{
				card = cards[j];
				//System.out.print(card);
				char cardRank = card.charAt(card.lastIndexOf(card));
				if (cardRank == rank[i]){
					q.insert(card+"\t");
				}
			}
			q.insert("\n");
		}
			q.display();
	}
}