import java.util.HashSet;

class RevisionUniqueSubsequences {
    public static void uniqueSubsequences(String str, int index, String newStr, HashSet<String> hs) {
        if (str.length() == index) {
            if (hs.contains(newStr))
                return;
            hs.add(newStr);
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // add
        uniqueSubsequences(str, index + 1, newStr + currChar, hs);
        // don't add
        uniqueSubsequences(str, index + 1, newStr, hs);
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        uniqueSubsequences("aaa", 0, "", hs);
    }
}