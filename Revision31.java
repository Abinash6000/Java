import java.util.*;
public class Revision31 {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString) {
        if (str.length()==idx) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a']) {
            removeDuplicates(str, idx+1, newString);
        } else {
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        removeDuplicates("abbccda", 0, "");
    }
}
