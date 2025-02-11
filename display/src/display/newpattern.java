package display;

public class newpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Assuming the pattern size is 5x5
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

	}

}
