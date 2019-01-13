package hijava.practice;

public class yy {
	int m = 2;
			
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i1=" + i);
		
		change1(i);
		System.out.println("i2=" + i);
		
		yy cd1 = new yy();
		System.out.println("cd1=" + cd1.m);
		
		change2(cd1);
		System.out.println("cd2=" + cd1.m);
	}

	public static void change2(yy cd) {
		cd.m = 100;
	}
	public static void change1(int x) {
		System.out.println("x=" + x);
		
		x = 100;
	}


}
