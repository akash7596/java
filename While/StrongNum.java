import java.util.Scanner;
public class StrongNum
{
  public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    System.out.println("Enter the Number:");
    int num = scn.nextInt();
    int temp = num;
    int sum =0;
    
    int digit;

    while (num>0) 
    {
     digit = num%10;
     int prod=1;
     
     for (int i=1 ; i<=digit ; i++)
      {
        prod = prod*i;
       }
     sum = sum+ prod;
     num/=10;
    }if (sum==temp){
    System.out.println("strong num");
    }else
    System.out.println("Not strong");
  
  }
}
  

