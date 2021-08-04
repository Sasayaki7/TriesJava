package com.sasayaki7.tries;

import java.util.HashMap;
public class Node {
	
	private HashMap<Character, Node> children;
	public boolean isCompletedWord;

	public Node() {
		this.children = new HashMap<Character, Node>();
		this.isCompletedWord = false;
	}
	
	public HashMap<Character, Node> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, Node> children) {
		this.children = children;
	}

	public boolean isCompletedWord() {
		return isCompletedWord;
	}

	public void setCompletedWord(boolean isCompletedWord) {
		this.isCompletedWord = isCompletedWord;
	}

	
}
