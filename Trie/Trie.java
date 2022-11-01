public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("The Trie has been created.");
    }

    // Insert Method
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie");
    }

    // Search for a word in Trie
    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return currentNode.endOfString;
    }

    // Delete a string from Trie
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index); // Getting the first character of the word.
        TrieNode currentNode = parentNode.children.get(ch); // parentNode is the root of the Trie. And its children from
                                                            // where the words start.
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1) { // This means that the currentNode is prefix of more than two words. So
                                               // we can't delete it.
            delete(currentNode, word, index + 1);
            return false; // Return false because we are not going to delete this currentNode.
        }
        if (index == word.length() - 1) { // if at the last character of the word // The string is a prefix of another
                                          // string.
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false; // currentNode.children.endOfString = false ???????????????
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currentNode.endOfString == true) { // some other string is a prefix of this string.
            delete(currentNode, word, index + 1);
            return false;
        }
        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted) { // Not any node depends on this string.
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }
}
