
public class Application2 {
	class Animal{
		void display() {
			System.out.println(" white");
		}
	}
	class Dog extends Animal {
		void display() {
			super.display();
			System.out.println(" black ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Application2(). new Dog();
		obj.display();

	}

}
