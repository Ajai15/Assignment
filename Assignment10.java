package assignment;

class Singleton {
	private static Singleton instance = null;
	private Singleton() {
		System.out.println("In Singltion Design pattern only one instance will be Created.");
	}
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

public class Assignment10{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("s1 and s2 are the same object");
		}
		if (s2 == s3) {
			System.out.println("s2 and s3 are the same object");
		}
		if (s3 == s1) {
			System.out.println("s3 and s1 are the same object");
		}
	}
}
