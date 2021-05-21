package baekjunalgorithm;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int seq[] = new int [num];
		Stack<Integer> stack = new Stack<>();
		List<Character> result = new ArrayList<Character>();
		
		for (int i=0;i<num;i++) {
			seq[i]=Integer.parseInt(bf.readLine());
		} //수열을 입력받음
		
		int save=0; //seq의 몇번째 인덱스까지 수열표시가 되엇는지 나타내는 변수
		
		
			for (int i=1;i<=num;i++) {
					stack.push(i);
					result.add('+');
					while(stack.isEmpty()==false) {
						if (stack.peek()==seq[save] ) {
							stack.pop();
							result.add('-');
							save++;
						}
						else
							break;
						}
			}
			
		if (stack.isEmpty()==false) {
			System.out.println("NO");
		}
		else {
			for (char ch : result) {
				System.out.println(ch);
			}
			
		}
			
	
	}
}

		