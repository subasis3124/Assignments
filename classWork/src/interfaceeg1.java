interface AnimalEat{
	void Eat();
}
interface AnimalTravel {
	void Travel();
}
class Animal implements AnimalEat,AnimalTravel {
	public void Eat() {
		System.out.println("animal is eating");
	}
	public void Travel() {
		System.out.println("animal is traveling");
	}
}
public class interfaceeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		obj.Eat();
		obj.Travel();
		

	}

}
