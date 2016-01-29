package serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserApp {
	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("B:\\Gitrepository\\corejava\\src\\light.ser");
		ObjectInputStream objstream =  new ObjectInputStream(inputStream);
		Light light = (Light)objstream.readObject();
		light.printStatus();
		inputStream.close();
		

	}
}
