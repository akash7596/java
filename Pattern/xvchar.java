class X_Pattern
{
}
{
	public static void main(String[] args) 
	{
		int n=5;
		char c='A';
		int p= 1;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i==j || i+j==n+1)
				{
					System.out.print(p);
					p++;
				}else if (i+j==n+1)
				{
					System.out.print(c);
					c++;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
