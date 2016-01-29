package serializable;

import java.io.Serializable;

public class Light implements Serializable,Cloneable {
	private  boolean status;
	
	public void on(){
		status = true;
	}
	
	public void off(){
		status = false;
	}
	
	public void printStatus(){
		System.out.println(" Light is " + ((status) ? "On" : "Off"));
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

