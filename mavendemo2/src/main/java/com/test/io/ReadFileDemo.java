package com.test.io;

import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ReadFileDemo {


public static void main(String[] args) throws Exception{
	//read the lines from file and placing the lines in list
	List<String>linedata=IOUtils.readLines(ReadFileDemo.class.getResourceAsStream("File.demo"));
	int linecount=linedata.size();
	System.out.println("total lines in the file: "+linecount+"   "+linedata);
	
	//copy data from list to set, so duplicate lines will be removed
	Set<String>lineset=new HashSet<String>(linedata);
	int uniquelines=lineset.size();
	System.out.println("unique data line count :"+uniquelines+"   "+lineset);
	
	//to get duplicate lines used subtract method
	List<String> duplicateLine=(List<String>)CollectionUtils.subtract(linedata,lineset);
	int duplicateLineCount=duplicateLine.size();
	System.out.println("duplicate data line count :" +duplicateLineCount+"   "+duplicateLine);
	
	//to write data from list to a file
	FileUtils.writeLines(new File("B:\\WorkArea\\mavendemo2\\src\\main\\resources\\com\\test\\io\\output.txt"), lineset, null);
	
	
	/*IOUtils.writeLines(lineset, null, new FileOutputStream(new File("B:\\WorkArea\\mavendemo2\\src\\main\\resources\\com\\test\\io\\output.txt")));*/
	
	
}
}
