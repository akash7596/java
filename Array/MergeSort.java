public class MergeSort {
    public static void main(String[] args) {
        int[] a = {9, 4, 6, 3};
        sort(a);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    public static void sort(int[] a) {
        if (a.length <= 1) return; // Fix base case condition
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        // Correctly populate left and right arrays
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);

        sort(left);
        sort(right);
        merge(a, left, right);
    }

    static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Correct merging logic
        while (i < b.length && j < c.length) {
            if ([i] < c[j]) {
                a[k++] = b[i++];
            } else {
                a[k++] = c[j++];
            }
        }
        while (i < b.length) {
            a[k++] = b[i++];
        }
        while (j < c.length) {
            a[k++] = c[j++];
        }
    }
}
