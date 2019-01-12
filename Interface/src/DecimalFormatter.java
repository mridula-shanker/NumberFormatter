
public class DecimalFormatter implements NumberFormatter
{
		public String getFormat(int num) 
		{	
			String inputNum = Integer.toString(num);  // converts integer to string
	        int numLength = inputNum.length(); // length of string
	        String numWithDot = "";
	        for (int i=0; i<numLength; i++) 
	        { 
	            if ((numLength-i)%3 == 0 && i != 0) // to find every 3rd position
	            {
	            	numWithDot += "."; // concatenates "." after every third number
	            }
	            numWithDot += inputNum.charAt(i); // concatenates the numbers
	        }
	        //System.out.println(numWithComma);
			return numWithDot;
		}
}
