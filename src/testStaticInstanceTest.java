
public class testStaticInstanceTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		StaticInstanceTest t1 = new StaticInstanceTest();
		StaticInstanceTest t2 = new StaticInstanceTest();
		
		StaticInstanceTest.displayStatic();
		StaticInstanceTest.displayStatic();
		
		t1.displayInstance();
		t1.displayInstance();
		t2.displayInstance();

	}

}
