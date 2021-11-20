package tree.binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;

	@Override
	public void insert(T data) {
		//This is when we insert the first node into the BST (the parent is null)
		if (root==null) {
			root = new Node<>(data, null);
		} else {
			//there are already items int he BST
			insert(data, root);
		}
		
	}
	private void insert (T data, Node<T> node) {
		
		if(node.getData().compareTo(data)<0) {
			if(node.getLeftChild()!=null)
				insert(data, node.getLeftChild());
			else
				node.setLeftChild(new Node<>(data,node));
		}else {
			if(node.getRightChild()!=null)
				insert(data, node.getRightChild());
			else
				node.setRightChild(new Node<>(data,node));
		}
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMax() {
		// the max item is the right most item in the right tree
		return null;
	}

}
