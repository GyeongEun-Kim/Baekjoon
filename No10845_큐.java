

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyQueue {
	int begin=-1;
	int end=-1;
	int queue[]= new int [10000];
	
	void push(int x ) {
		queue[++end]=x;
	}
	
	int pop() {
		if (begin!=end) {
			int temp=queue[++begin];
		
			queue[begin]=0;
			
			return temp;
		}
		else
			return -1;
	}
	
	int size() {
		return end-begin;
	}
	
	int empty() {
		if (begin==end)
			return 1;
		else
			return 0;
	}
	
	int front() {
		if (begin!=end) {
			return queue[begin+1];
		}
		else
			return -1;
	}
	
	int back() {
		if (begin!=end) {
			return queue[end];
		}
		else
			return -1;
	}
}

public class No10845_큐 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());
		
		MyQueue myQueue = new MyQueue();
		int x=0;
		
		for (int i=0;i<testcase;i++) {
			String input= bf.readLine();
			if (input.contains(" ")) {
				x=Integer.parseInt(input.split(" ")[1]);
				input=input.split(" ")[0];
			}
			
			switch (input) {
				case ("pop") :
					System.out.println(myQueue.pop());
					break;
				case ("size") :
					System.out.println(myQueue.size());
					break;
				case("empty") :
					System.out.println(myQueue.empty());
					break;
				case("front") :
					System.out.println(myQueue.front());
					break;
				case("back") :
					System.out.println(myQueue.back());
					break;
				case("push") :
					myQueue.push(x);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
