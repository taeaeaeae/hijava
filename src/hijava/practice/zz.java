package hijava.practice;

public class zz {
	public static void main(String[] args) {
	     char c = '��';		// cf. char c = 65;    or  char c = '\uD55C';
	     byte b = 'A';
     	 System.out.println(c);
	     System.out.println( (int)c );    // cf. (char)c  or   (char)b
	     System.out.println(b);
	     
	 	 String str = "AB";
	 	 
		 System.out.println(str);
		 System.out.println("AB".getBytes().length);
		 System.out.println("AB��".getBytes().length);
		 System.out.println("��".getBytes().length);

	}
}
