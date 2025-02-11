package display;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
	
		/*for(int i = 1; i <= 5; i++) {
	        for(int j = 1; j <= i; j++) {
	            System.out.print("* ");
	            
	        }
	           System.out.println(); */
	           
	           //2
	           
	          /* for(int i = 1; i <= 5; i++) {
	        	   for(int j = 5; j >= i; j--) {
	        		   System.out.print("*");
	        	   }
	        	   System.out.println();*/
	    //3
		
		/*for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();*/
		
		//4
		
		/*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int m = 5; m >= i; m--) {
                System.out.print("*");
            }
            System.out.println();*/
            
          /*  int i, s = 0;
            for(int k = 0; k < 5; k++){

            
                     i = 0;
                     do{
                        i++; s++;

                     }while (i < k);
           
            }
            System.out.println(s);*/
		
		/*int x = 10 , y = 5;
		System.out.println(x++^++y|(x=y)&101);*/
		
		/*int a = 10;
		int b = 5;
		int c = a++^++b|(a=b);
		System.out.println(c);*/
		//a++;
		/*System.out.println(a++);
		System.out.println(a);*/
	    
		
		//double a = 123.4;
		
		/*String s1 = "ITER";
		String s2 = "ITER";
		System.out.println("s1 == s2" + s1 == s2);*/
		
		/*int x = 6;
		System.out.println(~x);*/
		
		/*int x = Integer.MAX_VALUE;
		System.out.println(x>>30);*/
		
		
		/*int x=-4,y=4;
		System.out.println((x>>>30)+" "+(x>>30)+" "+
		(y>>1));*/
		
		/*int x=5;
		int y=x++ + ++x + ++x;
		int z=--y + x++ + y++;
		int p=z++ - (z%10) + (p=z);
		System.out.println(x+" "+y+" "+z+" "+p);*/
		
		/*int a=10;
		int b=5;
		int c=20;
		System.out.println(a < b && a < c);
		System.out.println(a < b & a < c);*/
		
		/*int v=10;
		System.out.println(v%=3*4);
		int x=11;
		System.out.println(-x--);
		System.out.println(x);
		x = -x--;
		System.out.println(x); int y = -x--;
		System.out.println(x+""+y);*/
		
		
			/*int num=10,num2=20, num3=40; 
			System.out.println("/"hello/"");
			byte b=128; float c=2.1; charc='a'; char cc=20;
			System.out.println(cc);*/
		
		
		
		/*int a = 10;
		 
		 if(++a==11 || ++a==12)
		 ++a;
		 System.out.println(a);*/
		
		/*int x=23;
		 String sup = (x < 15) ? "small" : (x < 22)? 
		 "tiny" : "huge";
		 System.out.println(sup);*/
		
		/*byte y=5,z= -5;
		System.out.println(~y);
		System.out.println(~z);
		y&= ~y;
		System.out.println(y);
		byte x = -1;
		System.out.println(x>>>6);
		byte a=-5,b=-6;
		System.out.println(a|b);*/ 
		
		/*int b = 14-32*4+175/8-3;
		boolean p1 = b-- == -99;
		System.out.println(p1);*/
		
		/*int var1 = 5; 
		 int var2 = 6;
		 if ((var2 = 1) == var1)
		 System.out.print(var2);
		 else 
		 System.out.print(++var2);*/
		
		/*int a=15;
		int b=25;
		if ((a<b) || (a=5)>15)
		 System.out.println(a);
		else
		 System.out.println(b);*/
		
		int x=15;
		 int y=10;
		 int z=5;
		 if(x>y & y>z)
		 if (x>z | y>x)
		 if(x>y ^ z<y)
		 System.out.println("Apple");
		 else
		 System.out.println("Orange");
		 else
		 System.out.println("Banana");
		 else
		 System.out.println("Grapes");

		
	


		
        
	}
	

}
