package tree;

public class App {
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.insert(50);
		bst.insert(20);
		bst.insert(40);
		bst.insert(100);
		bst.insert(-1);
	}

}
