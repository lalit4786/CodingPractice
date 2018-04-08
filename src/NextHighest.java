import java.util.Arrays;

public class NextHighest {
	
	static int nextGreater(int num)
	{
		char [] arrayNum = (num + "").toCharArray();
		
		int len = arrayNum.length;
		
		int i ;
		for (i = len-1 ; i > 0 ; i--)
		{
			if(arrayNum[i] > arrayNum[i-1])
				break;
		}
			
		if(i == 0)
		{
			return num;
		}
		
		int pos = i;
		int min = i-1;
		
		for(int j = pos + 1 ; j < len ; j++)
		{
			if(arrayNum[j]< arrayNum[pos] && arrayNum[j] > arrayNum[min])
			{
				pos = j;
			}
		}
		
		char c = arrayNum[min];
		arrayNum[min] = arrayNum[pos];
		arrayNum[pos] = c;

		Arrays.sort(arrayNum, i, len);
		
		return Integer.parseInt(String.valueOf(arrayNum));
	  }	
		public static void main(String[] args)
		{
			System.out.println("The next geater integer is " + nextGreater(12345));
		}

	}


