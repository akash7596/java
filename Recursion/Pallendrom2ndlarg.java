class PallendromSecLarge
{
  public static void main(String[] args) 
  {
    range (10,100,0);
  }

  public static void range(int st , int end,int count)
  {
    if (end<st) return;
    if (isPallendrom(end, end,0))
    {
      count++;
      if(count!=1 && count%2!=0)
      {
        System.out.println(end);
        return;
      }
      
    }
    range(st, end-1, count);

  }
  public static boolean isPallendrom(int n, int m,int rev)
  {
    if(n==0)return m==rev;
    return isPallendrom(n/10, m, (rev*=10)+(n%10));
  }

}
