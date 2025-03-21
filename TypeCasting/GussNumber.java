import java.util.Scanner;
class GussNumber 
{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter your Name");
    String Name = scn.next();
    int n = (int)(Math.random()*9)+1;
    int score =0;

    for (int i = 3; i > 0; i--) 
    {
     System.out.println("Guss anumber between(1-9)");
     int num = scn.nextInt();
     
     if (num==n) 
     {
      score+=10;
      n = (int)(Math.random()*9)+1;
     }
    }
    System.out.println(Name+"Your Score is:"+score);
  }
}
