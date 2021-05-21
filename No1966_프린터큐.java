package baekjunalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;

class Find {
	public static int findBiggest(Queue<Integer> q) {
		Integer temp=0;
		Object[] arr=q.toArray();
		for (int i=0;i<q.size();i++) {
			
			if (temp<(Integer)arr[i]) {
				temp=(Integer)arr[i];
			} 
		}
		return temp;
		
	}
}

public class No1966 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> myQueue = new LinkedList<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase= Integer.parseInt(bf.readLine());
		
		
		int fileCount; //������ � �ִ���
		int presentLoc; //ã����� ������ ���� ��ġ
		
		
		
		for (int i=0;i<testcase;i++) {
			myQueue.clear();
			int print=0; //���°�� ��µǴ���
			int biggest=1;
			String[] input = bf.readLine().split(" ");
			fileCount=Integer.parseInt(input[0]);
			presentLoc=Integer.parseInt(input[1]); 
			
			
			
			String imp[]=bf.readLine().split(" ");
			for (int j=0;j<fileCount;j++) {
				myQueue.add(Integer.parseInt(imp[j]));
			}
			//ť�� �������� ����(�߿䵵)
			
			
			while (true) {
				biggest=Find.findBiggest(myQueue);
			//System.out.println(biggest);
			//	System.out.println(presentLoc);
				if (presentLoc==0 && myQueue.peek()!=null) {
					if( biggest==myQueue.peek()) {
						print++;
						break;
						}
					else if(myQueue.peek()<biggest) {
						myQueue.add(myQueue.peek());
						myQueue.remove();
						presentLoc=myQueue.size()-1;
					 // �Ǿտ� �ִµ� �߿䵵�� �и���
					}
				}
				
				else if (presentLoc > 0 && myQueue.peek()!=null) {
					if (myQueue.peek()< biggest) {
						
						myQueue.add(myQueue.peek());
						myQueue.remove();
						presentLoc--;
					}// �Ǿտ� �߿䵵�� �и��� �ٸ����� �ְ� ã�°��� �ٸ����� ������
					else if (biggest==myQueue.peek()){
						myQueue.remove();
						print++;
						presentLoc--;
					}	//�߿䵵�� ���ϳ����� ��µɶ�
				}
						
			
					
			}
			System.out.println(print);
		}

	
	}
		
	
}


