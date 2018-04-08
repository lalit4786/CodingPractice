import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class getElementPair 
{	
	static void getpairs(int [] arr)
	{
		Set<Integer> sum = getPairSum(arr);
		
		int len = arr.length;
		
		Map<Integer,Set<ElementPair>> pairSumMap = new HashMap<Integer,Set<ElementPair>>();
		
		
		for(int s : sum)
		{
			for(int i = 0 ; i < len ; i++ )
			{
				for (int j = i+1 ; j < len ; j++)
				{
					if(s == arr[i] + arr[j])
					{
						if(pairSumMap.containsKey(s))
						{
							Set<ElementPair> temp = pairSumMap.get(s);
							temp.add(new ElementPair(i,j));
						}
						else
						{
							Set<ElementPair> temp = new HashSet<ElementPair>();
							temp.add(new ElementPair(i,j));
							pairSumMap.put(s, temp);
						}
							
					}
				}
			}
		}
		
		for(Integer k : pairSumMap.keySet())
		{
			if(pairSumMap.get(k).size() > 1)
			{
				for(ElementPair ele : pairSumMap.get(k))
				{
					System.out.print("["+arr[ele.index1]+","+arr[ele.index2]+"] ");
				}
				System.out.println("");
			}
		}
	}
	
	static Set<Integer> getPairSum(int [] arr)
	{
		
		Set<Integer> sum = new HashSet<Integer>();
		
		int len = arr.length;

		for(int i = 0 ; i < len ; i++ )
		{
			for (int j = i+1 ; j < len ; j++)
			{
				sum.add(arr[i] + arr[j]);
			}
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = { 1, 5, 7, -1};
		getpairs(arr);
	}

}
