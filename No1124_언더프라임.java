package baekjunalgorithm;
import java.io.*;
import java.util.ArrayList;

class pclass {
	ArrayList<Integer> primeLessThanB = new ArrayList<Integer>();
	
	
	int findPrime (int n,int i) {
		if(n%i==0 ) {
			n=n/i;
			primeLessThanB.add(i);
			if (n==1) 
				return 0;
			else
				return findPrime(n,i);
			}
		
		else {
			i++;
			return findPrime(n,i);
		}
		
	}
	
	
	boolean checkPrime (int n) {
		boolean check= false;
		int i;
		for (i=2;i<n;i++) {
			if (n%i==0) {
				check=false;
				break;
				}
			}
		if (i==n) {
			check=true; }
		return check;
		}
	
}
public class No1124_언더프라임 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[]= br.readLine().split(" ");
		int a= Integer.parseInt(arr[0]);
		int b= Integer.parseInt(arr[1]);
		
		int underPrimeCnt=0; //총 언더프라임이 몇개 인지
		
		/*
		pclass primeList = new pclass();
		primeList.findPrime(b,2); // 미리 소수인거 찾아서 메모
		*/
		
		//a부터 b까지 소수 리스트 작성
		for (int i=a;i<=b;i++) {
			pclass compareList = new pclass();
			compareList.findPrime(i, 2);
		//	System.out.println(compareList.primeLessThanB);
			if (compareList.checkPrime(compareList.primeLessThanB.size())==true)
				underPrimeCnt++;
			/*for (int j=0;j<primeList.primeLessThanB.size();j++) {
				if (compareList.primeLessThanB.size()==primeList.primeLessThanB.get(j)) {
					underPrimeCnt++;
				} */
		
		}
			
		// TODO Auto-generated method stub

		System.out.println(underPrimeCnt);

		}	
	}



