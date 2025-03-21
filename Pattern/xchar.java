class  X
{
	public static void main(String[] args) 
	{
		int n=5;
		char c='A';
		int p= 1;
		if (n%2==0)n+=1;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if ((i==1&&j==1) ||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==2) ||(i==5&&j==1))
				{
					System.out.print(p+" ");
					p++;
				}
				else if ((i+j==n+1)||(i==4&&j==4)||(i==5&&j==5))
				{
					System.out.print(c+" ");
						c++;
				}
				else
			
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
