
import java.util.*;
import java.io.*;

class Stack {
	int arr[];
	int size=0;
	public Stack (int t) {
		arr = new int[t] ;
	} 
	
	void push (int n) {
		arr[size++]=n;
	}
	
	int  pop () {
		if (size!=0) {
			return arr[--size];
		}
		else
			return -1;
	}
	
	int size () {
		return size;
	}
	
	int empty () {
		if (size==0)
			
			return 1;
		else
			return 0;
	}
	
	int top () {
		if (size!=0) {
			return arr[size-1];
		}
		else
			return -1;
	}
}

public class No10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(bf.readLine());
		
		Stack myStack= new Stack(testcase);
		
		for (int i=0;i<testcase;i++) {
			String s=bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			switch(st.nextToken()) {
				case ("pop") :
					System.out.println(myStack.pop());
					break;
				case ("size") :
					System.out.println(myStack.size());
					break;
				case ("top") :
					System.out.println(myStack.top());
					break;
				case ("empty") :
					System.out.println(myStack.empty());
					break;
				case ("push") :
					myStack.push(Integer.parseInt(st.nextToken()));
				}
		}
		// TODO Auto-generated method stub

	}

}
