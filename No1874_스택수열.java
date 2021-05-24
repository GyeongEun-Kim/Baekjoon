
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No1874_스택수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int seq[] = new int [num];
		Stack<Integer> stack = new Stack<>();
		List<Character> result = new ArrayList<Character>();
		
		for (int i=0;i<num;i++) {
			seq[i]=Integer.parseInt(bf.readLine());
		} //������ �Է¹���
		
		int save=0; //seq�� ���° �ε������� ����ǥ�ð� �Ǿ����� ��Ÿ���� ����
		
		
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

		