import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number < 0 || number > 9999) {
            System.out.println("Number out of range. Please enter a number between 0 and 9999.");
        } else {
            int a = number%10;// Last Digit
            int b = number/10;
            int c = b%10;
            int g = number/100;
            int d = g%10;
            int e = number/1000;

            String singleDigit[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String twoDigit[] = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String h = "hundred";
            String th = "thousand";

            if(number<20) System.out.println(singleDigit[number]);
            else if (number >= 20 && number < 100) 
                System.out.println(twoDigit[c] + " " + singleDigit[a]);
             else if (number >= 100 && number < 1000) 
                System.out.println(singleDigit[d] + " " + h + " " + twoDigit[c] + " " + singleDigit[a]);
                else System.out.println(singleDigit[e] + " " + th + " " + singleDigit[d] + " " + h + " " + twoDigit[c] + " " + singleDigit[a]);
            if (number == 0) System.out.println("zero");

            
            
        }
    }
  }
    



