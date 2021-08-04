package com.sasayaki7.tries;

public class TriesTest {
	public static void main(String[] args) {
        Tries trie = new Tries();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        System.out.println(trie.isPrefixValid("tr"));
        System.out.println(trie.isPrefixValid("ca"));
        System.out.println(trie.isPrefixValid("cb"));
        System.out.println(trie.isWordValid("car"));
        System.out.println(trie.isWordValid("card"));
        System.out.println(trie.isWordValid("chi"));
        trie.printAllKeys();
    }
}
