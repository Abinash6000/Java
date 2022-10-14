public class Revision51 {
    public static void subsequences(String str, int idx, String newString) {
        if (str.length() == idx) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // add
        subsequences(str, idx + 1, newString + currChar);
        // no add
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}
