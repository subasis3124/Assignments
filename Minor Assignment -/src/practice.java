
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int[] nums = {10, 11, 12, 13};

	        System.out.println("Original nums: In Binary");
	      for (int num : nums) {
	            System.out.println(num + " : " + Integer.toBinaryString(num));
	        }
	        System.out.println();
	        
	         
	        rotateRightBy2Bits(nums);

	        System.out.println("nums after rotating right by 2 bits:");
	         for (int num : nums) {
	            System.out.println(num + " : " + Integer.toBinaryString(num));
	        }
	        System.out.println();
	    
	    }

	    public static void rotateRightBy2Bits(int s[]) {
	        
	        for (int i = 0; i < s.length; i++) {
	         
	            s[i] = (s[i]>>>2)|(s[i]<<32 - 2);
	        }
	    }

	}

