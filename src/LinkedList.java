
public class LinkedList 
{
	private Node tail,head; 
	
	public LinkedList()
	{
		this.head = new Node("Head");
		this.tail = this.head;
	}
	
	public Node getHead()
	{
		return this.head;
	}
	
	public Node getTail()
	{
		return this.tail;
	}
			
	public void add(Node n)
	{
		this.tail.next = n;
		this.tail = n;
	}
	
	public String toString()
	{
		Node temp = this.head.next;
		StringBuilder str = new StringBuilder();
		
		while(temp != null)
		{
			str.append(temp.data + " ");
			temp = temp.next;
		}
		
		return str.toString();
	}
	
	static class Node
	{
		private String data;
		private Node next;
		
		public Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}	
}
