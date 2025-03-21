import java.util.Scanner;
class AmstrongNum
{
  public static void main(String[] args) 
  {
    Scanner scn =new Scanner (System.in);
    System.out.println("Entwr a num");
    int n = scn.nextInt();
    if(isArmstrong(n, n, 0))System.out.println("Armstrong Number");
    else System.err.println("Not a Armstrong Number");
  }
  public static int count (int n)
  {
    if(n==0) return 0;
    return 1+ count (n/10);
  }
  public static boolean isArmstrong(int n,int m,int sum)
  {
    if(n==0)return m==sum;
    sum+= Math.pow(n%10,count(m));
    return isArmstrong(n/10,m,sum);

  }
  
}
