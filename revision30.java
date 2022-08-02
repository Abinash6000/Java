public class revision30 {
    public static String Keypad[] = {".","abc","def","ghi","jkl","mmo","pqrs","tu","vwx","yz"};
    public static void printKeypadComb(String str, int idx, String Combination) {
        if (idx == str.length()) {
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = Keypad[currChar-'0'];
        for (int i = 0; i<mapping.length(); i++) {
            printKeypadComb(str, idx+1, Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printKeypadComb("23", 0, "");
    }
}
