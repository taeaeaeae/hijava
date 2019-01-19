package hijava.practice;

public class Loop1 {
	
	public static void main(String[] arge) {
		int i = 0;
		
		while(i++ < 10) {
				System.out.println("i=" + i);
			if (i %2 == 0)
				continue;
			
			//i++; // i = i + i
			if (i > 5) {
				break;
			}
			
			if ( i % 2 == 1)
				System.out.println("TTTTTTTTTT>> " + i);
		}
	}

}
