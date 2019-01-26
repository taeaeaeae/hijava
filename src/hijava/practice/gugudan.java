package hijava.practice;

public class gugudan {

	public static void main(String[] args) {
		// 2 ~ 9 loop
		// 1 ~ 9 loop

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1)
				continue;
			System.out.println(i + "단 --------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

}
