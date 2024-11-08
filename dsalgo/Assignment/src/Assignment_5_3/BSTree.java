package Assignment_5_3;

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
	
	public void addNode(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			root= newnode;
		else {
			Node trav= root;
			
			while(true) {
				if(value <trav.getData()) {
					if(trav.left == null)
					{
						trav.left= newnode;
						break;
					} else 
						trav= trav.left;
				}
				else {
					if(trav.right == null)
					{
						trav.right= newnode;
						break;
					} else 
						trav= trav.right;
				}
			}
		}
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
	
	
	
	public Node binarySearch(int key) {
		//1. start from root
		Node trav= root;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.getData())
				//return current node
				return trav;
			//3. if key is less than current data
			else if(key < trav.getData())
				// search key into left of current node
				trav= trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav=trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. if key is not found
		return null;
	}
	
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav= root;
		Node parent = null;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.getData())
				break;
			parent = trav;
			//3. if key is less than current data
			if(key < trav.getData())
				// search key into left of current node
				trav= trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav=trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. if key is not found
		if(trav ==  null)
			parent= null;
		return new Node[] {trav, parent};
	}
	
	
	public void deleteNode(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node temp= arr[0], parent= arr[1];
		
		if(temp == null)
			return;
		
		//if node has 2 childs
		if(temp.left != null && temp.right != null){
			//1. find predecessor of temp.data
			Node succ = temp.right;
			parent = temp;
			while(succ.left != null){
				parent = succ;
				succ = succ.left;
			}
			//2. replace temp's data by predecessor's data
			temp.data = succ.data;
			//3. delete predecessor
			temp = succ;
		}
		
		//if node has single child (right child)
		if(temp.left == null) {
			if(temp == root)
				root= temp.right;
			else if(temp == parent.left)
				parent.left= temp.right;
			else if(temp == parent.right)
				parent.right = temp.right;
		}
		
		//if node has single child (left child)
		else //if(temp.left == null) 
				{
					if(temp == root)
						root= temp.left;
					else if(temp == parent.left)
						parent.left= temp.left;
					else if(temp == parent.right)
						parent.right = temp.left;
				}
	}
	
	public void deleteAll() {
		root = null;
	}
}

