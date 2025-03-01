import java.util.Scanner;
class Solution {
    public boolean isPalindrome(String x) {
        return x.equals(new StringBuilder(x).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print the string to select if it`s Palindrome:: ");
        String x = scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(x));
    }
}
