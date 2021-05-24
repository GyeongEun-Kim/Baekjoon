
import java.util.Scanner;

class OX {
	String score;
	int k=0;
	int sum=0;
}


public class No8958_OX퀴즈 {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		OX arr[]=new OX[num];
		
		for (int i=0;i<num;i++) {
			arr[i]=new OX();
			arr[i].score=scanner.next();
		}
		//각 테스트케이스의 객체를 만들기
		
		for (int j=0;j<num;j++) {
			for (int i=0;i<arr[j].score.length();i++) {
				if (arr[j].score.charAt(i)=='O') {
					arr[j].k++;
					arr[j].sum+=arr[j].k;
				}
				else
					arr[j].k=0;
			}
		}	//점수 계산
		
		for (int i=0;i<num;i++) {
			
			System.out.println(arr[i].sum);	
		}//출력
		// TODO Auto-generated method stub

	}

}
