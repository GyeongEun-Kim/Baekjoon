package baekjunalgorithm;

import java.util.*;

 class stack {
	ArrayList<Integer> Stack = new ArrayList<Integer>();
	int sum=0;
	
	public void push (int n) {
		Stack.add(n);
		
	}
	public int pop () {
		return Stack.remove(Stack.size()-1);
		
	}
	
	public int sum () {
			while (Stack.isEmpty()!=true) 
				sum+=this.pop();	
			return sum;
	}
 }
 
public class No10773_제로 {

	public static void main(String[] args) {
		stack s = new stack();
		Scanner scanner = new Scanner(System.in);
		int temp;
		int num=scanner.nextInt();
		
		for (int i=0;i<num;i++) {
			temp=scanner.nextInt();
			if (temp!=0) 
				s.push(temp);
			else
				s.pop();
		}
		
		System.out.println(s.sum());
		scanner.close();
		// TODO Auto-generated method stub

	}
}


