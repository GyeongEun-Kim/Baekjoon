package baekjunalgorithm;

import java.util.Scanner;
import java.util.Stack;

public class No9012 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();
		
		
		for (int i=0;i<num;i++) {
			boolean printed=true;
			Stack<Character> mystack = new Stack<>();
			String input= scanner.next();
			for (int j=0;j<input.length();j++) {
				if (input.charAt(j)=='(') {
					
					mystack.push(input.charAt(j));
					}
				else if (input.charAt(j)==')') {
					if (mystack.size()>0)
						mystack.pop();
					else {
						System.out.println("NO");
						printed=false;
						break;
					}
				}
						
			}
			if (mystack.size()!=0) {
				System.out.println("NO");
			}
			else if (printed==true){
					System.out.println("YES");
			}
		}
		
}
}
