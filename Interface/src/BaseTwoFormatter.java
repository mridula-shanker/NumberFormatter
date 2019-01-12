public class BaseTwoFormatter implements NumberFormatter
{
	public String getFormat(int inputNum) 
	{
		int a;
	    String rtnStr = "";
	    while(inputNum > 0)
	    {
	    	a = inputNum % 2; // to check even or odd
	    	rtnStr = rtnStr + "" + a; // concatenate 0 for even number and 1 for odd
	    	inputNum = inputNum / 2;  // base 2
	    }
	      //System.out.println("Binary number:"+rtnStr);
	    return rtnStr;
	}
      
}
