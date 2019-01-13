package hijava.practice;

/**
 * 첫번째자바실습
 * @author taekyoung
 * @update say함수 추가 (2019-01-12 by ggg)
 */

public class hello {

	public static void main(String[] args) {

//		 hellojava에게 say 명령내림
		hello.say("Hi~"); //

//		출력스스로JVM
		System.out.println("hello java!!");
		
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
