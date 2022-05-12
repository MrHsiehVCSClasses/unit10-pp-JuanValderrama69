package u10pp;

public class RecursivePalindromeChecker {
    /**
     * checks if a string is a palindrome
     * 
     * @param s
     * @return true if s is a palindrome, or false otherwise
     */
    public static boolean isPalindrome(String s) {

        int i = 0; // index of first char
        int j = s.length() - 1; // index of last char

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

}