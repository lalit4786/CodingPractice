import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node implements Comparable<Node>
{
	int num;
	int freq;
	int firstindex;
	
	public Node(int num,int freq,int firstindex)
	{
		this.num = num;
		this.freq = freq;
		this.firstindex = firstindex;
	}

	@Override
	public int compareTo(Node o) 
	{
		if(this.freq < o.freq)
		{
			return 1;
		}
	    else if (this.freq > o.freq)
		{
			return -1;
		}
		else
		{
			return Integer.compare(this.firstindex, o.firstindex);
		}
	}
}

public class SortByFreq 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,5,2,6,3,5,3,4,1,10,3,5,8,7,6,9,2,5,5,3,3,4};
		
		System.out.println(Arrays.toString(arr));
		
		Map<Integer,Node> map = new HashMap<Integer,Node>();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], new Node(arr[i],1,i));
			}
			else
			{
				map.get(arr[i]).freq += 1;
			}
		}
		
		List<Node> values = new ArrayList<Node>(map.values());
		
		Collections.sort(values);
		
		int position = 0;
		
		for(Node v : values)
		{
			for(int j = 0 ; j < v.freq ; j++,position++)
			{
				arr[position] = v.num;
			}
		}
	
		System.out.println(Arrays.toString(arr));
	}
	

}
