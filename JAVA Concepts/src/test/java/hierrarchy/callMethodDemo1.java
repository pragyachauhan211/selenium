package hierrarchy;

public class callMethodDemo1 {

	public static void main(String[] args) {
		Animal d = new Dog();
		d.sound();
		
		System.out.println("---------------------");
		
		Animal d1 = new Animal();
		d1.sound();

		System.out.println("---------------------");
		
		Dog d2 = new Dog();
		d2.sound();
	}

}
