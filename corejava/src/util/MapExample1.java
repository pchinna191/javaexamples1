package util;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;


public class MapExample1 {

	public static void main(String...args){
		Map<String,String> map=new Hashtable<String,String>();
	map.put("120", "Lakshmi");
	map.put("121", "Lavanya");
	map.put("110", "Lakshmi");
	map.put("120", "kiranmayee");
	map.put("132", "Teja");
	System.out.println(map);
	System.out.println(map.get("120"));
	Set se=map.keySet();
	System.out.println(se);
	}
}
