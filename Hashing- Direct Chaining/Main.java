public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(13);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("Brown");
        directChaining.insertHashTable("Fox");
        directChaining.displayHashTable();
        directChaining.deleteKeyHashTable("fox");
    }
}