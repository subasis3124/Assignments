
public class prac2 {
	public static <T> void swap(T var1, T var2 ) {
		System.out.println("before swap");
		System.out.println(var1 +" "+ var2);
		T temp;
		temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("after swaping");
		System.out.println(var1 + " " + var2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(3 , 7);
		swap(3.5 , 7.5);
		swap("dsa" , "icp");
		

	}

}
