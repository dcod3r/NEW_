package Assignment_5_1;

public class BSTree {

	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			setData(value);
			left= right=null;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
	}
	
	private Node root;
	public BSTree() {
		root= null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	private void addNode(Node trav, int value) {
		if(value <trav.getData()) {
			if(trav.left == null)
			{
				trav.left= new Node(value);
			} else 
				addNode(trav.left, value);
		}
		else {
			if(trav.right == null)
			{
				trav.right= new Node(value);
			} else 
				addNode(trav.right, value);
		}
	}
	
	public void addNode(int value) {
		if (root == null) {
            root = new Node(value);  //if is empty
        } else 
		addNode(root, value);
	}
	
	private void PreOrder(Node trav) {
		if(trav== null)
			return;
		System.out.print(" "+ trav.getData());
		PreOrder(trav.left);
		PreOrder(trav.right);
	}	
	
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	
	private void PostOrder(Node trav) {
		if(trav== null)
			return;
		PostOrder(trav.left);
		PostOrder(trav.right);
		System.out.print(" "+ trav.getData());
	}	
	
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	
	private void InOrder(Node trav) {
		if(trav== null)
			return;
		InOrder(trav.left);
		System.out.print(" "+ trav.getData());
		InOrder(trav.right);
		
	}	
	
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	

	
	public void deleteAll() {
		root = null;
	}
}
