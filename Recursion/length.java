class Length
{
  public static void main(String[] args) {
    System.out.println(count(89545612));
  }
  public static int count (int n)
  {
    if(n==0) return 0;
    return 1+ count (n/10);
  }
  
}
