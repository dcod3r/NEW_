package Assignment_5_3;

import Assignment_5_3.BSTree.Node;

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
		
		
		bst.deleteNode(8);
		System.out.println("PreOrder Traversal : ");
		bst.PreOrder();
		
//		bst.deleteNode(14);
//		System.out.println("PreOrder Traversal : ");
//		bst.PreOrder();
		
//		bst.deleteNode(10);
//		System.out.println("PreOrder Traversal after Delete node 10 : ");
//		bst.PreOrder();
		
		BSTree.Node ret = bst.binarySearch(10);
		if(ret == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found");
		
		
		Node[] result = bst.binarySearchWithParent(10);
		if (result[0] != null) {
            System.out.println("Key is found.");
            if (result[1] != null) {
                System.out.println("Parent node is: " + result[1].getData());
            } else {
                System.out.println("The node is the root, so no parent.");
            }
        } else {
            System.out.println("Key is not found.");
        }
	}

}









