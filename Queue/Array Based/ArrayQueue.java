


public class ArrayQueue<E> implements Queue<E>{

	private static final int CAPACITY = 10;

	private E[] data;
	
	private int f = 0;

	private int sz = 0;


	public ArrayQueue(){
		this(CAPACITY);
	}

	public ArrayQueue(int capacity){
		data = (E[]) new Object[capacity];
	}
	
	public int size(){
		return sz;	
	}

	public boolean isEmpty(){
		return (sz==0);
	}		

	public void enqueue(E e) throws IllegalStateException{
		if(sz == data.length) throw new IllegalStateException("Queue is full!");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
		System.out.println(e +" is enqueued");
	}

	public E dequeue(){
		if(isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}

	public E first(){
		if(isEmpty()) return null;
		return data[f];
	}	
	
	public void print(){

		//int t = f;
		int i = f;
		int t = 0;
		while(t < data.length){
			
			i = (i + 1) % data.length;
			
			System.out.print(data[t] + " ");
			t++;
		}
	
	}


}













