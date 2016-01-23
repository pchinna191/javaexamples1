package util;
import java.io.FileInputStream;
import java.util.Properties;
public class MapExample2 {
	public static void main(String[] args)  throws Exception{
		Properties properties = new Properties();
		/*String envName = System.getProperty("app.env.name");
		if(envName != null){
			properties.load(MapExample2.class.getResourceAsStream(envName+"-database.properties"));
			System.out.println(properties);
			System.out.println(properties.get("username"));
		}else{
			System.err.println(" Environment is Missing");
			System.exit(-345);
		}*/
		properties.load(new FileInputStream("B:\\Gitrepository\\corejava\\src\\dev-database.properties"));
		System.out.println(properties);
		System.out.println(properties.get("username"));
	}
}
