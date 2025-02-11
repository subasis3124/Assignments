
public class Application1 {
	class Animal {
		String colour = " white ";
	}
	class Dog extends Animal{
		String colour = " black ";
		void display() {
			System.out.println(colour);
			System.out.println(super.colour);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Application1().new Dog();
		obj.display();

	}

}
