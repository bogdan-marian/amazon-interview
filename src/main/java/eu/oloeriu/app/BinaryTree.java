package eu.oloeriu.app;

public class BinaryTree{
	Node root;
	
	
	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node (value);
		}
		
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		}else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		}else {
			//value allready exist
			return current;
		}
		
		return current;
	}
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	private boolean containsRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		
		if (value == current.value) {
			return true;
		}
		return value < current.value
				? containsRecursive (current.left, value)
				: containsRecursive (current.right, value);
	}
	
	public boolean containsNode(int value) {
		return containsRecursive(root, value);
	}
	
	
	public class Node{
		int value;
		Node left;
		Node right;
		
		Node (int value){
			this.value = value;
			left = null;
			right = null;
		}
		
	}
	
}
