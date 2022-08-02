
public class revision36 {
    public static String[] keypad = { ".", "abc", " def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void comb(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            comb(str, idx + 1, newStr + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        comb("23", 0, "");
    }
}
