public class Palindrome{
    public static boolean is_palindrome(String s)
    {

    String clean = s.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    int forward = 0;
    int backward = length - 1;
    while (backward > forward) {
        char forwardChar = clean.charAt(forward++);
        char backwardChar = clean.charAt(backward--);
        if (forwardChar != backwardChar)
            return false;
    }
    return true;
    }
}
