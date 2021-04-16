package practice.leecode.Trie;


public class Trie_208 {

    private boolean exist;
    private Trie_208[] nexts;

    public Trie_208() {
        this.exist = false;
        this.nexts = new Trie_208[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie_208 trie = this;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (trie.nexts[idx] == null) {
                trie.nexts[idx] = new Trie_208();
            }
            trie = trie.nexts[idx];
        }
        trie.exist = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie_208 trie = this;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (trie.nexts[idx] == null) {
                return false;
            }
            trie = trie.nexts[idx];
        }
        return trie.exist;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie_208 trie = this;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (trie.nexts[idx] == null) {
                return false;
            }
            trie = trie.nexts[idx];
        }
        return true;
    }

//    private Node node;
//
//    private class Node {
//        private boolean exist;
//        private Character val;
//        private Map<Character, Node> nexts;
//        public Node(Character val, Map<Character, Node> nexts) {
//            this.val = val;
//            this.nexts = nexts;
//            this.exist = false;
//        }
//    }
//
//    public Trie_208() {
//        this.node = new Node(null, new HashMap<>());
//    }
//
//    /** Inserts a word into the trie. */
//    public void insert(String word) {
//        Node node = this.node;
//        for (char ch : word.toCharArray()) {
//            if (!node.nexts.containsKey(ch)) {
//                node.nexts.put(ch, new Node(ch, new HashMap<>()));
//            }
//            node = node.nexts.get(ch);
//        }
//        node.exist = true;
//    }
//
//    /** Returns if the word is in the trie. */
//    public boolean search(String word) {
//        Node node = this.node;
//        for (char ch : word.toCharArray()) {
//            if (!node.nexts.containsKey(ch)) {
//                return false;
//            }
//            node = node.nexts.get(ch);
//        }
//        return node.exist;
//    }
//
//    /** Returns if there is any word in the trie that starts with the given prefix. */
//    public boolean startsWith(String prefix) {
//        Node node = this.node;
//        for (char ch : prefix.toCharArray()) {
//            if (!node.nexts.containsKey(ch)) {
//                return false;
//            }
//            node = node.nexts.get(ch);
//        }
//        return true;
//    }

}
