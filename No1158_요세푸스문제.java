package baekjunalgorithm;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ppl = sc.nextInt();
		int offset = sc.nextInt();
		
		
		Queue<Integer> myqueue = new LinkedList<>();
		for (int i =1 ;i<= ppl; i++) 
			myqueue.add(i);
		
		System.out.print("<");
		for (int i=0;i<ppl ; i++) { //총 ppl번만큼 반복
			for (int j=1; j<=offset;j++) {
				if (j==offset) {
					System.out.print(myqueue.peek());
					myqueue.remove();
					if (myqueue.isEmpty()!=true)
						System.out.print(", ");
				}
				else {
					myqueue.add(myqueue.peek());
					myqueue.remove();
				}
			}
		
		// TODO Auto-generated method stub
		}
		System.out.println(">");
	}
}
