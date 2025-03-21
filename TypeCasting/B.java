class B
{
  public static void main(String[] args)
  {
   System.out.println(m1()); 
   int i=20;
   m2 (i); // Auto Widening
   m2 ('a'); // Auto Widening
  }
  static double m1()
  {
    int a=10;
    return a; // Auto Widening
  }
  static void m2(double d)
  {
    System.out.println("d="+d);
  }
}