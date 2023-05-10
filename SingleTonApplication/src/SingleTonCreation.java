
public class SingleTonCreation {

	private SingleTonCreation() {
		System.out.println("Hello");
	}

	static SingleTonCreation s1 = null;

	private static SingleTonCreation getInstance() {
		if (s1 == null) {
			s1 = new SingleTonCreation();
		}
		return s1;

	}

	public static void main(String[] args) {
		SingleTonCreation S2 = SingleTonCreation.getInstance();
		SingleTonCreation S3 = SingleTonCreation.getInstance();
		SingleTonCreation S4 = SingleTonCreation.getInstance();

		System.out.println("the adress is : " + S2.hashCode());
		System.out.println("the adress is : " + S3.hashCode());
		System.out.println("the adress is : " + S4.hashCode());

	}

}
