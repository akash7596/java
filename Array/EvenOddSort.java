import java.util.Arrays;

public class EvenOddSort {
    public static void main(String[] args) {
        int[] a = {6, 10, 3, 4, 7, 9, 12, 5};
        int[] result = new int[a.length];

        int left = 0;
        int right = a.length - 1;

        // Separate even and odd numbers into result array
        for (int num : a) {
            if (num % 2 == 0) {
                result[left++] = num; // place even from the start
            } else {
                result[right--] = num; // place odd from the end
            }
        }

        // Sort even part
        Arrays.sort(result, 0, left);

        // Sort odd part
        Arrays.sort(result, right + 1, a.length);

        // Print result
        System.out.print("Sorted Even-Odd Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
