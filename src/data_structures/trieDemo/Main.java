package data_structures.trieDemo;

import java.util.HashSet;

class TrieNode{
    private Character character;
    private HashSet<TrieNode> children;
    private Boolean isEndOfWord;

    public TrieNode(Character character) {
        this.character = character;
        this.children = new HashSet<>();
        this.isEndOfWord = false;
    }

    public Character getCharacter() {
        return character;
    }

    public HashSet<TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashSet<TrieNode> children) {
        this.children = children;
    }

    public Boolean getEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(Boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    public TrieNode getChild(Character c) {
        for (TrieNode child : children) {
            if (child.getCharacter().equals(c)) {
                return child;
            }
        }
        return null;
    }

    public void addChild(TrieNode child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "character=" + character +
                ", children=" + children +
                ", isEndOfWord=" + isEndOfWord +
                '}';
    }
}

class Trie{
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode(null); // Root doesn't hold any character
    }

    public void insert(String word) {
        TrieNode node = root;

        for (Character c : word.toCharArray()) {
            TrieNode child = node.getChild(c);
            if (child == null) {
                // If the character is not present, add it as a new node
                child = new TrieNode(c);
                node.addChild(child);
            }
            node = child;
        }
        // Mark the last node as the end of a word
        node.setEndOfWord(true);
    }

    public boolean search(String word) {
        TrieNode node = root;

        for (Character c : word.toCharArray()) {
            TrieNode child = node.getChild(c);
            if (child == null) {
                return false;  // If a character is not found, the word doesn't exist
            }
            node = child;  // Move to the next node
        }
        return node.getEndOfWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (Character c : prefix.toCharArray()) {
            TrieNode child = node.getChild(c);
            if (child == null) {
                return false;
            }
            node = child;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("apt");
        trie.insert("bat");
        trie.insert("batch");
        trie.insert("bath");

        // Test search
        System.out.println(trie.search("apple"));       // true (word "apple" exists)
        System.out.println(trie.search("app"));         // true (word "app" exists)
        System.out.println(trie.search("appl"));        // false (only prefix, not a full word)
        System.out.println(trie.search("application")); // true (word "application" exists)
        System.out.println(trie.search("apt"));         // true (word "apt" exists)
        System.out.println(trie.search("bat"));         // true (word "bat" exists)
        System.out.println(trie.search("batch"));       // true (word "batch" exists)
        System.out.println(trie.search("bath"));        // true (word "bath" exists)
        System.out.println(trie.search("bathroom"));    // false (word "bathroom" doesn't exist)

        // Test startsWith
        System.out.println(trie.startsWith("app"));  // true (prefix "app" exists)
        System.out.println(trie.startsWith("bat"));  // true (prefix "bat" exists)
        System.out.println(trie.startsWith("ba"));   // true (prefix "ba" exists)
        System.out.println(trie.startsWith("batt")); // false (no word starts with "batt")
        System.out.println(trie.startsWith("z"));    // false (no word starts with "z")
    }
}
