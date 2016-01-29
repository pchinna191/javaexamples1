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
		CSVParser parser=null;
		
		List<Student> stulist1=readCsvFile(parser);
		System.out.println("Total records count :"+ stulist1.size());
	
         
        List<Student> stulist2=removeInvalidRecords(stulist1);
       /* 	Collections.sort(stulist2,new StudentChainedComparators(
                new NameSort(),
                new FeeSort()));
   			*/
        Collections.sort(stulist2, new StudentComparatorv2());
    	Set<Student>stuset=new HashSet<Student>(stulist2);
    	
    	System.out.println("unique records :"+stuset.size());
    	
    	//to get duplicate lines used subtract method
    	
    	List<Student> duplicateRec=(List<Student>)CollectionUtils.subtract(stulist2,stuset);
    	
    	System.out.println("duplicate records :" +duplicateRec.size());
		
    	FileUtils.writeLines(new File("B:\\Gitrepository\\mavendemo2\\src\\main\\resources\\com\\test\\io\\output2"), stuset);
     }
	
	private static List<Student>readCsvFile(CSVParser parser)throws Exception
	{
	List<Student> stulist = new ArrayList<Student>();
    CSVFormat format = CSVFormat.DEFAULT.withHeader();
    parser = new CSVParser(new FileReader("B:\\Gitrepository\\mavendemo2\\src\\main\\resources\\com\\test\\io\\studentrecords.csv"), format);
    	for(CSVRecord record : parser){
        	Student stu = new Student();
        	String rec1=record.get(0);
        		if(rec1!=null&&!rec1.isEmpty()){
        			stu.setEno(Integer.parseInt(rec1));
        			}
        		else{
        			stu.setEno(0);	
        		}
        	stu.setEname(record.get(1));
            stu.setFee(Integer.parseInt(record.get(2)));
            stu.setCourse(record.get(3));
            stulist.add(stu);	
        	}
    	parser.close();
		return stulist;
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


