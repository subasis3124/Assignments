import java.util.*;
public class A1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "CARBON";
		for(int l1 = 0; l1 < str.length(); l1++) {
			for(int l2 = 0; l2 < str.length(); l2++) {
				for(int l3 = 0; l3 < str.length(); l3++) {
					for(int l4 = 0; l4 < str.length(); l4++) {
						for(int l5 = 0; l5 < str.length(); l5++) {
							for(int l6 = 0; l6 < str.length(); l6++) {
								if(l1 != l2 && l1 != l3 && l1 != l4 && l1 != l5 && l1 != l6 && l2 != l3 && l2 != l4 && l2 != l5 && l2 != l6 && l3 != l4 && l3 != l5 && l3 != l6 && l4 != l5 && l4 != l6 && l5 != l6)
								System.out.println(str.charAt(l1) + " " + str.charAt(l2) + " " + str.charAt(l3) + " " + str.charAt(l4) + " " + str.charAt(l5) + " " + str.charAt(l6));
							}
						}
					}
				}
			}
		}
		

	}

}
