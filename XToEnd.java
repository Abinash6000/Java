public class XToEnd {
    public static void xToEnd(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i =0; i<count; i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx)=='x') {
            count++;
            xToEnd(str, idx+1, count, newString);
        } else {
            newString+=str.charAt(idx);
            xToEnd(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        xToEnd("axbcxxd", 0, 0, "");
    }
}
