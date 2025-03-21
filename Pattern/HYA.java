class HallowPyramid2
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp=n-1;
		int st=1;
		char ch='A';
		int p=1;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
				System.out.print(" ");
			for (int k=1;k<=st ;k++ )
			{
				if (k==1 || i==n|| k==st)
					{
			     System.out.print(ch);
				  ch++;
				  }
					else {
					System.out.print(p);
					p++;
					}
			}
				
			System.out.println();
			sp--;
			st+=2;
			
		}
	}
}
/* A
   B1C
  D234E
 F56789G
HIJKLMNOP
*/