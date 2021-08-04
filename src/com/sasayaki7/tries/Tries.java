package com.sasayaki7.tries;

public class Tries {
	private Node root;

	public Tries() {
		this.root = new Node();
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insertWord(String word) {
		Node currentNode = this.root;
		
		for (int i=0; i < word.length(); i++) {
			Character currentLetter = word.charAt(i);
			
			Node child = currentNode.getChildren().get(currentLetter);
			if(child==null) {
				child = new Node();
				currentNode.getChildren().put(currentLetter, child);
			}
			currentNode = child;
		}
		
		currentNode.setCompletedWord(true);
	}
	
	public boolean isPrefixValid(String prefix) {
		Node currentNode = this.root;
		for (int i =0; i < prefix.length(); i++) {
			Character currentLetter = prefix.charAt(i);
			Node child = currentNode.getChildren().get(currentLetter);
			if(child == null) {
				return false;
			}
			currentNode = child;
		}
		return true;
	}
	
	
	public boolean isWordValid(String word) {
		Node currentNode = this.root;
		for (int i =0; i < word.length(); i++) {
			Character currentLetter = word.charAt(i);
			Node child = currentNode.getChildren().get(currentLetter);
			if(child == null) {
				return false;
			}
			currentNode = child;

		}
		return currentNode.isCompletedWord();
	}
	private void printAllKeys(Node n, String x) {
		for (Character c : n.getChildren().keySet()) {
			System.out.println(x+c);
			printAllKeys(n.getChildren().get(c), x+c);
		}
	}

	public void printAllKeys() {
		Node currentNode = this.root;
		for (Character c : currentNode.getChildren().keySet()) {
			System.out.println(c);
			printAllKeys(currentNode.getChildren().get(c), ""+c);
		}
	}
}
