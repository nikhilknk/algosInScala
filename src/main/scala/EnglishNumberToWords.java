/**
 * 
 */

/**
 * @author Swetha
 *
 */
public class EnglishNumberToWords {

	private static final String[] tensNames = {
	    "",
	    " ten",
	    " twenty",
	    " thirty",
	    " forty",
	    " fifty",
	    " sixty",
	    " seventy",
	    " eighty",
	    " ninety"
	  };

	  private static final String[] numNames = {
	    "",
	    " one",
	    " two",
	    " three",
	    " four",
	    " five",
	    " six",
	    " seven",
	    " eight",
	    " nine",
	    " ten",
	    " eleven",
	    " twelve",
	    " thirteen",
	    " fourteen",
	    " fifteen",
	    " sixteen",
	    " seventeen",
	    " eighteen",
	    " nineteen"
	  };
	  
	  private static final String[] specialNames = {
		  "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	  };
	  /**
	 * @param args
	 */
	public static void main(String[] args) {
		 	System.out.println(convert(1234567));
	        System.out.println(convert(-55));
	}
	
	private static String convert(int number) {
		
		if(number == 0) return "zero";
		
		String prefix = "";
		
		if(number<0){
			prefix = "Negative";
			number = -number;
		}
			
		
		int place = 0;
		String current = "";
		
		do{
			int n = number%1000;
			if(n!=0){
			String s = convertLessThanOneThousand(n);
			current = s + specialNames[place] + current;
			}
			place++;
			number = number/1000;
		}while(number>0);
		
		return prefix+current;
	}

	private static String convertLessThanOneThousand(int number) {
		
		String current;
		
		if((number%100)< 20){
			current = numNames[number%100];
			number = number/100;
		}else{
			
			current = numNames[number%10];
					
			number /= 10;
					
			current = tensNames[number%10]+current;
			number /= 10;
		}
		
		if(number ==0) return current;
		
		return numNames[number] + " hundred " + current;
		
	}

}
