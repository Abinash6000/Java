class Main {
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        System.out.println(newTrie.search("APIS"));
        newTrie.delete("APIS");
        System.out.println(newTrie.search("APIS"));
    }
}