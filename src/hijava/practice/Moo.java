package hijava.practice;

public class Moo {
	    
	    public static void main(String[] args) {
	        
	        int j = 0;
	    	
	        for (int i = 2; i <= 100; i++) {
	            boolean isPrime = true;
	            for (int k = 2; k < i; k++) {
	                if(i % k == 0) 
//	                    continue;
	                isPrime = false;
//	                break;
	            }

					if(isPrime) 
	                
	        j = j + i;
	        System.out.println(j);
	            }
	       
	    }
}

