import java.util.*;
public class Subsequences {
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        // To be
        subsequences(str, idx+1, newString+curChar);
        // Not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}
