package serializable;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton sObj = Singleton.getInstance();
		Singleton sObj1 = Singleton.getInstance();
		Singleton sObj2 = Singleton.getInstance();

	}
}
