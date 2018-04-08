import java.util.Scanner;

public class test 
{	
	private static int binomial(int n, int k)
	{
		int c = 0;
		
		for(int j = 0 ; j <= k ; j++)		
		{
			if(j == 0)
				c = 1;
			else
			{
				c = c*(n-j+1)/j;
			}
		}
		
		return c;
	}
	
	private static int getStraightLines(int totalPoints,int colPoints)
	{
		if(totalPoints < 0 || totalPoints == 0 || colPoints < 0 || colPoints == 0)
			return 0;
		else if (totalPoints < colPoints)
			return 0;
		else
		{
			return (binomial(totalPoints,2) - binomial(colPoints,2) + 1);
		}
			
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		int m = scr.nextInt();
		
		System.out.println("Number of straight lines : "+getStraightLines(n,m));
		
	}
}
