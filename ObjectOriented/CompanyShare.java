package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.QueueLinkList;
import com.bridgelabz.Utility.StackLinkList;
import com.bridgelabz.Utility.Utility;

public class CompanyShare {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, Exception
	{
		new Utility();
		StackLinkList stk = new StackLinkList();
		QueueLinkList que = new QueueLinkList();
		File file = new File("/home/bridgeit/workspace/Files/compshare.json");
		FileReader fr = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(fr);
		Iterator<?> itr = array.iterator();
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(array);
		ll.display();
		System.out.println("Enter the share symbol");
		String symbol =Utility.inputString();
		while(itr.hasNext())
		{
			JSONObject obj = (JSONObject) itr.next();
			//ll.add(obj.get(symbol));
			//ll.display();
			if(obj.containsKey(symbol))
			{
				System.out.println("Share symbol already their in list");
				System.out.println("To add share press 1 and To remove share press 2");
				int choice = Utility.inputInt();
				switch(choice)
				{
				case 1 : 
							System.out.println("Enter the number of share want to buy");
							int num_share = Utility.inputInt();
							JSONObject object = (JSONObject) obj.get(symbol);
							int key = Integer.parseInt(object.get("NumOfShare").toString());
							int new_shares_count = key + num_share;
							object.remove("NumOfShare");
							object.put("NumOfShare", new_shares_count);
							System.out.println("Succesfuly added");
							//ll.add(object);
							ll.display();
							FileWriter fw = new FileWriter(file);
							fw.write(JSONValue.toJSONString(array));
							fw.flush();
							fw.close();
						
					break;
				case 2 : 	System.out.println("Enter the amount of share to sale");
							int amt = Utility.inputInt();
							JSONObject object1 = (JSONObject) obj.get(symbol);
							int share_amt = Integer.parseInt(object1.get("ShareAmt").toString());
							int num_share1 = Integer.parseInt(object1.get("NumOfShare").toString());
							int new_shares_count1 = num_share1 - (amt/share_amt);
							object1.remove("NumOfShare");
							object1.put("NumOfShare", new_shares_count1);
							System.out.println("Successfully removed");
							//ll.remove(object1);
							ll.display();
							FileWriter fw1 = new FileWriter(file);
							fw1.write(JSONValue.toJSONString(array));
							fw1.flush();
							fw1.close();
					break;
				}
				
			}
			else
			{
				JSONObject object = new JSONObject();
				System.out.println("Enter number of share");
				int num = Utility.inputInt();
				System.out.println("Enter share amount");
				int amt = Utility.inputInt();
				object.put("NumOfShare",num );
				object.put("ShareAmt",amt);
				obj.put(symbol,object);
				ll.add(obj);
				ll.display();
				System.out.println("Added successfully");
				
				stk.insert(symbol);
				stk.display();
				
				que.insert(symbol);
				que.display();
				
				FileWriter fw = new FileWriter(file);
				fw.write(JSONValue.toJSONString(array));
				fw.flush();
				fw.close();
			}
			
		}
		
	}
}
