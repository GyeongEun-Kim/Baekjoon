package baekjunalgorithm;
import java.util.Scanner;

public class No1094_막대기 {
	static int cnt=0;
	
	static int toBinary(int x) {
		if (x==0 ) {
			return 0;
		}
		else if (x==1) {
			cnt++;
			return 0;
		}
		else {
			if (x%2==1)
				cnt++;
			return toBinary(x/2);
			}
		}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		toBinary(x);
		
		System.out.println(cnt);
		
		// TODO Auto-generated method stub

	}

}
