
public class StaticInstanceTest 
{
	private static int i = 0;
	private int j = 0;
	
	public static void displayStatic()
	{
		
		System.out.println(i);
		i++;
	}
	
	public void displayInstance()
	{
		System.out.println(j);
		j++;
	}
}
