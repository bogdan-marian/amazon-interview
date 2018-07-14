package eu.oloeriu.app;

public class SingletonExample {
	private static SingletonExample instance = null;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstace() {
		if (instance == null) {
			instance = new SingletonExample();
		}
		return instance;
	}
}
