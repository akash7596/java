public class Even {
  public static void main(String[] args) {
    range (2 , 100);
  }
   
  public static void range(int start, int end) {
    if (start > end)
      return;
    if (start % 2 == 0)
      System.out.println(start);
    range(start + 1, end);
  }
  
}
