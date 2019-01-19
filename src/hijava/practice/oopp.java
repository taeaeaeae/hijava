package hijava.practice;

public class oopp 

	public static void main(String[] args) {
	// sumbyWhile();
	    snmByFor();
	}

    private static void snmByFor() {
    	int total = 0;
    	for (int i = 0; i < 100; i++ ) {
    		System.out.println("i=" + i);
    		total = total + i;
    	}
    	System.out.println("Result is" + total);

}
