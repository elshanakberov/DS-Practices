

public class ArrayStack<E> implements Stack<E> {


	public static final int CAPACITY = 10; // Default array capacity

	private E[] data; // Generic Array with type of E

	private int t = -1; // index of the top element in stack

	public ArrayStack(){
		
		this(CAPACITY);
	}

	public ArrayStack(int size){
		data = (E[]) new Object[size];
	}

	public int size(){
		return (t+1);
	}

	public boolean isEmpty(){
		if(this.size() == -1){
			return true;
		}

		return false;
	}
	
	public void push(E e){
	
		if(size() == data.length) throw new IllegalStateException("Stack is full"); 
		
		data[++t] = e;
	}

	public E pop(){
	
		if(isEmpty()) return null;

		E answer = data[t];
		
		data[t] = null;

		t--;

		//System.out.println(answer+" is popped");
		
		return answer;
	}

	public E top(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		return data[t];

	}

}
