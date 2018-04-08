package com.linkedlist.programs;

public class MatrixLinkedList 
{
	private class Node
	{
		int data;
		Node right;
		Node bottom;
	}
	
	
	public Node linkByMatrix(int [][] arr, int i , int j , int m , int n)
	{
		if(i>n-1 || j > m-1)
			return null;
		
		Node temp = new Node();
		temp.data = arr[i][j];
		
		temp.right = linkByMatrix(arr,i,j+1,m,n);
		temp.bottom = linkByMatrix(arr,i+1,j,m,n);
		
		return temp;
	}
	
	public void display(Node head_ref)
	{
		Node rp,dp;
		
		dp = head_ref;
		
		while(dp!=null)
		{
			rp = dp;
			while(rp!=null)
			{
				System.out.print(rp.data + " ");
				rp = rp.right;
			}
			
			System.out.println();
			dp = dp.bottom;
		}
	}
	
	public static void main(String [] args)
	{
		MatrixLinkedList ml = new MatrixLinkedList();
		
		int arr[][] = { { 1, 2, 3 }, 
                { 4, 5, 6 }, 
               { 7, 8, 9 } };
		
		int m = 3 , n = 3;
		
		ml.display(ml.linkByMatrix(arr,0,0,m,n));
	}
}
