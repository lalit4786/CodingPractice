
class ElementPair 
{
	int index1,index2;
	
	public ElementPair(int x,int y)
	{
		this.index1 = x;
		this.index2 = y;
	}
	
	public String toString()
	{
		return("["+this.index1+","+this.index2+"] ");
	}
}
