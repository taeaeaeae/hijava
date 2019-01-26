package hijava.practice;

public class Prime {

	public static void main(String[] args) {
		Integer i[] = new Intger[] {1,2,3};
		int[] ii = new int

		int total = 0;

		for (int num = 2; num <= 100; num++) {
			boolean isPrimeNum = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrimeNum = false;
					break;
				}
			}

			if (isPrimeNum)
				total = total + num;
			else
				System.out.println(num);
		}
		System.out.println(total);
	}

}
