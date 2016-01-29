package serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SerApp {

	public static void main(String[] args) throws Exception {
		Light light = new Light();
		
		light.off();
		FileOutputStream outputStream = new FileOutputStream("B:\\Gitrepository\\corejava\\src\\light.ser");
		ObjectOutputStream objstream =  new ObjectOutputStream(outputStream);
		objstream.writeObject(light);
		light.printStatus();
		/*Light light1 = (Light)light.clone();
		light1.printStatus();*/
		outputStream.close();
		

	}

}

