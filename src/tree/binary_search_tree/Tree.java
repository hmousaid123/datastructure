package tree.binary_search_tree;

public interface Tree<T> {
	
	public void insert(T data);
	public void remove(T data);
	//In0order traversal yields the natural ordering
	public void traversal();
	
	public T getMin();
	public T getMax();

}
