class A 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5 ;i++ )
		{
			for(int j=0;j<9;j++)
			{
				if ((i+j==4) || (j-i==4) || (i==3&&j==4))
				{
					System.out.print(j);
				}else
					{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}
