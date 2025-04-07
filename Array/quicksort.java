public class quicksort {
  public static void main(String[] args) {
    int a[]={5,9,3,8,6,1,13,2,10};
    sort(a,0,a.length-1);
    for (int e : a) {
      System.out.println(e);
    }
  }
  public static void sort(int[]a ,int start, int end){
    if (start>=end) {
      return;
    }
    int i=start, j=end,pivot=a[(start+end)/2];
    while (i<=j) {
      while (a[i]<pivot) {
        i++;
      }
      while (a[j]>pivot) {
        j--;
      }
      if (i<=j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
      }
    }
    sort(a, start, j);
    sort(a, i, end);
  }
}
