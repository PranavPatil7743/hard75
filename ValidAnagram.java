import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // Check if the lengths of the strings are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Compare the sorted character arrays
        return Arrays.equals(charArrayS, charArrayT);
    }

    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        if (isAnagram(s, t)) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
    }
}
