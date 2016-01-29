package serializable;

public class Singleton {

	private static Singleton singletonRef;
	
	private Singleton(){ 
		System.out.println(" SingleTon : Object Created");
	}
	
	static{
		singletonRef = new Singleton();
	}
	
	public  static Singleton getInstance(){
		if(singletonRef == null){
			synchronized(singletonRef) {
				if(singletonRef == null){
					singletonRef = new Singleton();
				}
			}
		}
		return singletonRef;
	}
}

