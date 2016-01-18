package corejavaconcepts;
//import java.io.*;


public class StringBuffeerDemo {
	
	
	public static void main(String[] args){
		String str="hello";
		char[] ch={'a','b','c'};
		StringBuffer sb=new StringBuffer(str);
		sb.append(true);
		sb.append(" how");
		sb.append(ch);
		sb.insert(0, ch);
		System.out.println(sb);
		int a=sb.lastIndexOf("o");
		System.out.println(a);
		
		System.out.println(sb.toString());
			
	}

}
