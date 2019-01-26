package hijava.practice;

public class lpppp {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

//		while(i++ < 50) {
//			j = j + (2*i-1);
//			System.out.println(j);
//		}

		while (i++ < 100) {
			if (i % 2 == 0)
				continue;
			j = j + i;
			System.out.println(j);
		}

	}

}
