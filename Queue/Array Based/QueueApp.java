

public class QueueApp{


	public static void main(String args[]){
	
		
		ArrayQueue<Integer> q = new ArrayQueue<>();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		
		//System.out.println(q.size());	
		//System.out.println(q.first());

		q.dequeue();
		q.enqueue(4);	
		q.dequeue();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
	System.out.println(q.first());
		//System.out.println(q.size());
		//System.out.println(q.size());
		//System.out.println(q.size());
		//System.out.println(q.size());
		//System.out.println(q.size());
		//System.out.println(q.size());
	





		//System.out.println(q.size());
		//System.out.println(q.size());
				
		//System.out.println(q.first());
	

		q.print();
	
	}


}
