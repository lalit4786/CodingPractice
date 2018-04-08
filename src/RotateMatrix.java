
public class RotateMatrix 
{	
	private static int [][] testMatrix ;
	private static int size; 
	
	static void creatMatrix(int n)
	{
		size = n;
		
		testMatrix = new int [size][size];
		
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size ; j++)
			{
				testMatrix[i][j] = i+j;
			}
		}
	}
	
	static void printMatrix()
	{
		for(int i = 0 ; i < size ; i++)
		{
			System.out.print("[ ");
			for(int j = 0 ; j < size ; j++)
			{
				System.out.print("   "+testMatrix[i][j] + "   ");
			}
			System.out.println(" ]");
		}
	}
	
	static void swap(int x1,int x2,int x3,int x4)
	{
		int temp;
		
		temp = testMatrix[x1][x2];
		testMatrix[x1][x2] = testMatrix[x3][x4];
		testMatrix[x3][x4] = temp;

	}
	
	static void rotateby90()
	{
		int totallevel = size/2;

		for(int level = 0,last = size - 1; level < totallevel ; level++,last--)
		{
			for(int j = level ; j < last ; j++)
			{
				swap(level,j,j,last);
				swap(level,j,last,last-j+level);
				swap(level,j,last-j+level,level);
			}
		}	
	}

	public static void main(String[] args) 
	
	{
		// Test for 2 X 2 Matrix
		
		creatMatrix(2);
		
		System.out.println("------------------Matrix Before Rotation-----------------");
		
		printMatrix();
		
		System.out.println("------------------Matrix After Rotation-----------------");
		
		rotateby90();
		printMatrix();
		
		// Test for 3 X 3 Matrix
		
		creatMatrix(3);
		
		System.out.println("------------------Matrix Before Rotation-----------------");
		
		printMatrix();
		
		System.out.println("------------------Matrix After Rotation-----------------");
		rotateby90();
		printMatrix();
		
		// Test for 3 X 3 Matrix
		
		creatMatrix(4);
				
		System.out.println("------------------Matrix Before Rotation-----------------");
				
		printMatrix();
				
		System.out.println("------------------Matrix After Rotation-----------------");
		rotateby90();
		printMatrix();
	}

}
