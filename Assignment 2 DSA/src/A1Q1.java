class person1 {
int age;
String name;
  void setData(int a , String n) {
	age = a;
	name = n;
 }
  void display() {
	  System.out.println("age is " + age);
	  System.out.println("Name is " + name);
  }
}

public class A1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 obj = new person1();
		obj.name = " Subasis ";
		obj.age = 18;
		person1 obj2 = new person1();
		obj2.name = " liku ";
		obj2.age = 19;
		if(obj2.age > obj.age) {
			System.out.println(obj.name + "is younger");
		}else {
			System.out.println(obj2.name + "is younger");
		}

	}

}
