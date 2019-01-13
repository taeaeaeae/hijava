package hijava.practice;

public class n {

		int a = 33;
		int b = 22;
		
//		public void swap2() {
//		int c = 1;
//		c = a;
//		a = b;
//		b = c;
//		}77
		
		public void swap() {
			a = a+b;
		    b = a-b;
		    a = a-b;
	}
		public static void main(String[] args) {
			n N = new n();
			System.out.println("a=" + N.a);
			System.out.println("b=" + N.b);
			N.swap();
			System.out.println("a=" + N.a);
			System.out.println("b=" + N.b);
			
		}

}
