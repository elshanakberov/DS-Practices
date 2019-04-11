

public class JavaApp{

	
	
	public static void main(String args[]){

		
		Stack<Integer> S = new ArrayStack<>();

		S.push(5);
		S.push(6);
		S.push(7);

		System.out.println(S.pop());
		//System.out.println(S.pop());
		System.out.println(S.top());
	}



}
