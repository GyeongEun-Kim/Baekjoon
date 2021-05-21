package baekjunalgorithm;

import java.util.Stack;
import java.io.*;
public class No10799 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt=0; //잘려진 쇠막대기의 숫자

		try {
				Stack<Integer> mystack = new Stack<>();
		
				
				String input=br.readLine();
				
				for (int j=0;j<input.length();j++) {
						if (input.charAt(j)=='(')
							mystack.push(j);
						else  {
							int idx=mystack.pop();
							if (j-idx==1) { //인접한괄호 . 레이저
							
								cnt=cnt+mystack.size();
							}
							else {
					
								cnt++;
								
							}
						}
					} 
				System.out.println(cnt);
				
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		// TODO Auto-generated method stub

	}


