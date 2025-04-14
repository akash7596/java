public class StringPalindrome {
  public static void main(String[] args) {
    String word = "madam";

    if (isPalindrome(word, 0, word.length() - 1)) {
      System.out.println(word + " is a palindrome");
    } else {
      System.out.println(word + " is not a palindrome");
    }
  }

  public static boolean isPalindrome(String s, int left, int right) {
    // Base case: if left >= right, done checking
    if (left >= right) return true;

    // If characters don't match, it's not a palindrome
    if (s.charAt(left) != s.charAt(right)) return false;

    // Recursive case: check inner substring
    return isPalindrome(s, left + 1, right - 1);
  }
}
