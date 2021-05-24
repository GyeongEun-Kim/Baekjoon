

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

public class No1966_프린터큐 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> myQueue = new LinkedList<>();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int testcase= Integer.parseInt(bf.readLine());


		int fileCount; //파일이 몇개 있는지
		int presentLoc; //찾고싶은 문서의 현재 위치



		for (int i=0;i<testcase;i++) {
			myQueue.clear();
			int print=0; //몇번째로 출력되는지
			int biggest=1;
			String[] input = bf.readLine().split(" ");
			fileCount=Integer.parseInt(input[0]);
			presentLoc=Integer.parseInt(input[1]);



			String imp[]=bf.readLine().split(" ");
			for (int j=0;j<fileCount;j++) {
				myQueue.add(Integer.parseInt(imp[j]));
			}
			//큐에 문서들을 넣음(중요도)


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
						// 맨앞에 있는데 중요도로 밀릴때
					}
				}

				else if (presentLoc > 0 && myQueue.peek()!=null) {
					if (myQueue.peek()< biggest) {

						myQueue.add(myQueue.peek());
						myQueue.remove();
						presentLoc--;
					}// 맨앞에 중요도가 밀리는 다른것이 있고 찾는것은 다른곳에 있을때
					else if (biggest==myQueue.peek()){
						myQueue.remove();
						print++;
						presentLoc--;
					}	//중요도가 제일높은게 출력될때
				}



			}
			System.out.println(print);
		}


	}


}


