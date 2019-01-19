package hijava.practice;

public class op {
	
	public static void main(String[] arge) {
		int n1 = 10;
		int n2 = 20;
		boolean result;
		
		result = ((n1 > 10) && (n2 < 10));
		System.out.println(result);
		result = ((n1 > 10)|| (n2 > 10));
		System.out.println(result);
		System.out.println(!result);
	}

}
