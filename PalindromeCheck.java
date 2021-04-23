/*
A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome.
Tip: Use word.charAt(i) to get the character at position i.
*/
public class PalindromeCheck {
    public boolean isPalindrome(String word) {
    boolean isPalindrome = true;
	int n = 0;
	int m = word.length() - 1;
		if(word.charAt(n) != word.charAt(m)) 
        return isPalindrome = false;
return isPalindrome;
    }
    public static void main(String[] args) {
        PalindromeCheck pal = new PalindromeCheck();
        System.out.println(pal.isPalindrome("abcba"));
        System.out.println(pal.isPalindrome("Hello"));
    }
}
