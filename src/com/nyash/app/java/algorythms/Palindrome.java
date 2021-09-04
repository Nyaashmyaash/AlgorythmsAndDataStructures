package algorythms;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12345153"));
    }

    public static Boolean isPalindrome(String numberAsString) {

        char[] characters = numberAsString.toCharArray();
        boolean isPalindrome = true;

        for (int index = 0; index < characters.length; index++) {
            char element = characters[index];

            if (element != characters[characters.length - 1 - index]) {
                isPalindrome = false;
                break;
            }

        }
        return isPalindrome;
    }
}
