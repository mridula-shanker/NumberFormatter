import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		NumberFormatter nf = new BaseTwoFormatter();	
		int num=in.nextInt();
		String formatNum = nf.getFormat(num);
		System.out.println(formatNum);
	}

}
