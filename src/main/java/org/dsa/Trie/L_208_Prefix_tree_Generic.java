package org.dsa.Trie;

import java.util.HashMap;

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

/**
 * This is the generic implementation, this can be made more efficient modifying the internal
 * structure like using the arrays for string lowercase 0-26 like this.
 */
class L_208_Prefix_tree {

    class TrieNode {
        boolean word;
        HashMap<Character, TrieNode> children = new HashMap<>();
    }

    TrieNode root;

    public L_208_Prefix_tree() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode curr = this.root;
        for (Character c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.word = true;
    }

    public boolean search(String word) {

        TrieNode curr = this.root;
        for (Character c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                return false;
            }
            curr = curr.children.get(c);
        }
        return curr.word;
    }

    public boolean startsWith(String prefix) {

        TrieNode curr = this.root;
        for (Character c : prefix.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                return false;
            }
            curr = curr.children.get(c);
        }
        return true;
    }
}