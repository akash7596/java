import java.util.Scanner;
class PrimeRange
{
  public static void main(String[] args) 
  {
   Scanner scn = new Scanner(System.in);
   System.out.println(" Range Start");
   int start = scn.nextInt();
   System.out.println(" Range End");
   int End =scn.nextInt();

   for (int i = start; i <=End; i++) 
   {
    if(i<=1) continue;
     boolean flag = true;
     for (int j=2; j<=i/2; j++)
     {
      if(i%j==0)
       {
         flag = false;
         break;
       }
    }
    if (flag) System.out.println(i);
   }
  }
}