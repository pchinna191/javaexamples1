package util;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class ExampleDemo {
	
	  public static void main(String args[]) throws Exception {
		  String s="B:\\Gitrepository\\corejava\\src\\util\\ListDemo2.java";  
		  FileInputStream fis = new FileInputStream(s);

		    BufferedInputStream bis = new BufferedInputStream(fis);

		    int i;
		    while ((i = bis.read()) != -1) {
		      System.out.println(i);
		    }

		    fis.close();
		  }
}

