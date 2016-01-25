package com.test.io;

import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.list.CursorableLinkedList;
import org.apache.commons.collections.list.SetUniqueList;
import org.apache.commons.collections.list.TreeList;

public class ListExampleV1 {
	private static List uniqueList;
	  private static List cursorList;
	 public static void main(String args[]) {
		    ListExampleV1 listExample = new ListExampleV1();
		    listExample.createLists();

		    uniqueList.add("Value1");
		    uniqueList.add("Value1"); 
		    System.err.println(uniqueList); // should contain only one element

		    cursorList.add("Element1"); 
		    cursorList.add("Element2"); 
		    cursorList.add("Element3"); 

		    ListIterator iterator = cursorList.listIterator();
		    iterator.next(); // cursor now between 0th and 1st element
		    
	    iterator.add("Element2.5"); // adds this between 0th and 1st element

		    System.err.println(cursorList); // modification done to the iterator are visible in the list
		  }

		  private void createLists() {
		    uniqueList = SetUniqueList.decorate(new TreeList());
		    cursorList = new CursorableLinkedList();
		  }

		  
}
