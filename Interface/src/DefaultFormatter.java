public class DefaultFormatter implements NumberFormatter
{
	public String getFormat(int num) 
	{	
		String inputNum = Integer.toString(num);  // converts integer to string
        int numLength = inputNum.length(); // length of string
        String numWithComma = "";
        for (int i=0; i<numLength; i++) 
        { 
            if ((numLength-i)%3 == 0 && i != 0) // to find every 3rd position
            {
            	numWithComma += "."; // concatenates "," after every third number
            }
            numWithComma += inputNum.charAt(i); // concatenates the numbers
        }
        //System.out.println(numWithComma);
		return numWithComma;
	}
	
}
