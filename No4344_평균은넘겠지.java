
import java.io.*;

public class No4344_평균은넘겠지 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine()); //테스트 케이스
		
		for (int i=0;i<tc;i++) {
			String temp = br.readLine();
			int sNum = Integer.parseInt(temp.split(" ")[0]); //학생이 몇명인지
			int[] sScore = new int [sNum]; //학생들 점수를 저장할 배열
			int sSum=0; //학생 점수의 총합
			
			for (int j=0;j<sNum;j++) {
				sScore[j]=Integer.parseInt(temp.split(" ")[j+1]); //점수 배열에 각각 저장
				sSum+= sScore[j]; //총합을 구함
			}
			
			float avg= (float)sSum/sNum; //평균 점수
			int cnt=0; //평균보다 높은점수를 가진 학생들 수 
			
			for (int k=0;k<sNum;k++) {
				if (sScore[k]>avg) { //평균보다 점수가 높으면
					cnt++; 
				}
			}
			
			System.out.printf("%.3f%%\n",(float)cnt/sNum*100);
			
		}

	}

}
