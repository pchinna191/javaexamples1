package com.test.io;


import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

public class ReadCsvFile {

	public static void main(String[] args) throws  Exception {
        
        //Create the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
         
        //initialize the CSVParser object
        CSVParser parser = new CSVParser(new FileReader("B:\\WorkArea\\mavendemo2\\src\\main\\resources\\com\\test\\io\\studentrecords.csv"), format);
         
        List<Student> stulist1 = new ArrayList<Student>();
        
        for(CSVRecord record : parser){
            Student stu = new Student();
            
            	String rec1=record.get(0);
            		if(rec1!=null&&!rec1.isEmpty())
            		{stu.setEno(Integer.parseInt(record.get(0)));
            			}
            		else{
            			stu.setEno(0);	
            		}
            	stu.setEname(record.get(1));
                stu.setFee(Integer.parseInt(record.get(2)));
                stu.setCourse(record.get(3));
                stulist1.add(stu);	
            	}
        System.out.println("Total records in the file :"+ stulist1.size()+"   "+stulist1);  	
      //close the parser
        parser.close();  
        
   
        
       List<Student> stulist2=removeInvalidRecords(stulist1);
    	
    	Set<Student>stuset=new HashSet<Student>(stulist2);
    	int uniquelines=stuset.size();
    	System.out.println("unique records :"+uniquelines+"   "+stuset);
    	
    	//to get duplicate lines used subtract method
    	List<String> duplicateLine=(List<String>)CollectionUtils.subtract(stulist2,stuset);
    	int duplicateLineCount=duplicateLine.size();
    	System.out.println("duplicate records :" +duplicateLineCount+"   "+duplicateLine);
		
    	List<Student>stulist3=new ArrayList<Student>(stuset);
    	
    	
    	/*Collections.sort(stulist3,new StudentChainedComparators(
                 new NameSort(),
                 new FeeSort()));*/
    	Collections.sort(stulist2, new StudentComparatorv2());
    	System.out.println("Records After sorted : "+ stulist3);
    	
    	FileUtils.writeLines(new File("B:\\WorkArea\\mavendemo2\\src\\main\\resources\\com\\test\\io\\output2"), stulist3);
        
    	
	}
	
	private static List<Student>removeInvalidRecords(List<Student>studlist){
		int invaliddata=0;
        Iterator<Student>itr=studlist.iterator();
        while(itr.hasNext()){
        	Student st=itr.next();
        	if(st.getEno()==0&&(st.getEname().isEmpty()||st.getEname()==null)){
        		itr.remove();
        		invaliddata=invaliddata+1;
        	}
        }
        System.out.println("invalid records: "+invaliddata);
		
		
		return studlist;
	
	}
}


