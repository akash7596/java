class E
{
	public static void m1()
	{
		System.out.println("m1 start");
		System.out.println("m1 Ends");
	}
	public static void main (String[]args)
		{
			System.out.println("main starts");
			E.m1();
			E.m1();
			System.out.println("main ends");
		}
}

class F
{
	public static void main(String[]args)
	{
		System.out.println("main start");
		F.m1();
		System.out.println("mains end");
	}
	public static void m1()
		{
			System.out.println("m1 Start");
			F.m1();
			System.out.println("m1 Ends");
		}

		public static void m2()
			{
				System.out.println("m2 start");
				System.out.println("m2 start");
			}
}

class G
{
	public static void main(String[]args)
	{
		System.out.println("main of G class Start");
		F.m1();
		System.out.println("main of G class Ends");
	}
}
	


