

public interface Stack<E>{

	/**
	 * @returns size of the stack
	 */	

	int size();

	boolean isEmpty();

	void push(E e);

	E pop();

	E top();


}
