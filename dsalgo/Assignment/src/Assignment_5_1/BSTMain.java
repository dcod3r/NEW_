package Assignment_5_1;

public class BSTMain {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		System.out.println("PreOrder Traversal : ");
		bst.PreOrder();
		System.out.println("PostOrder Traversal : ");
		bst.PostOrder();
		System.out.println("InOrder Traversal : ");
		bst.InOrder();
		

	}

}
