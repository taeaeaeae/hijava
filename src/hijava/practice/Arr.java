package hijava.practice;

import hijava.oop.Mom;

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();

		Mom mom = new Mom("영자");
		mom.say();
		Mom.son = new Son("길동");
		son.say();
		
		System.out.println(son.getName());
		
	}

	private static void ex5() {
		int upperStart = 65;
		int lowerStart = 97;

		int[] starts = new int[] { upperStart, lowerStart };
		int[][] arr = new int[2][3];

		for (int start = 0; i < starts.length; start++) {
			for (int i = 0; i < 26; i++) {
				int x = i + starts[start];
				System.out.println(x + "=" + (char) x);
				arr[start][i] = (char)x;
			}
		}

//		for ( int i = upperStart; i < upperStart + 26; i++) {     
//			System.out.println(i + "=" +(char)i);
//		}
	}

	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i + 1) + "수");
		}

		Man[] people2 = new Man[len];
		for (int i = 0; i < len; i++) {
			people2[i] = people[i]; // shallow copy
//			people2[i] = new Man(people[i]).getName()); //deep copy(clone)
		}

		people[0].setName("김11111111");

		System.out.println("1=" + people[0].getName());
		System.out.println("2=" + people2[0].getName());

	}

	private static void ex3() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			people[i] = m;
			people[i] = new Man("김" + (i + 1) + "수");
		}

		for (Man man : people) {
			System.out.println(man);
		}

	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;

		for (int i = 0; i < len; i++) {
			strs[i] = "str" + (i + 1);

		}

		printArray(strs);

	}

	private static void ex1() {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;

		}

		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
