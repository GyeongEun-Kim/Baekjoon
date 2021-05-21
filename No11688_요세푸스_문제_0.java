import java.util.LinkedList;
import java.util.Queue;
import java.io.*;

public class No11688_요세푸스_문제_0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[]= br.readLine().split(" ");
		int n= Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		int pointer =1;
		int result [] = new int[n];
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		
		for (int i=1;i<=n;i++) {
			myQueue.add(i);
		}
		
		int j=0;
		int kth=1;
		
		while (myQueue.isEmpty()!=true) {
			if (pointer>myQueue.size()) {
				pointer%=myQueue.size();
			}
			if (kth==k) {
				//System.out.println(myQueue.peek());
				result[j++]=myQueue.peek();
				myQueue.remove();
				kth=0;
			}
			else {
				//System.out.println(myQueue.peek());
				myQueue.add(myQueue.peek());
				myQueue.remove();
				
				}
			kth++;
			pointer++;
		
			}
		
		System.out.print("<");
		for (int i=0;i<n;i++) {
			System.out.print (result[i]);
			if (i!=(n-1))
				System.out.print(", ");
		}
		System.out.print(">");
		// TODO Auto-generated method stub

	}

}