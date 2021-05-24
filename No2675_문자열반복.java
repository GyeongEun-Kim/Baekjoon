
import java.util.Scanner;
public class No2675_문자열반복 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int testcase=scanner.nextInt();
		
		
		for (int i=0;i<testcase;i++) {
			int mul=scanner.nextInt();
			String s=scanner.next();
			String n=""; //빈 스트링 하나 생성
			for (int j=0;j<s.length();j++) {
				for (int k=0;k<mul;k++)
					n+=s.charAt(j);
			}
			System.out.println(n);
		}
		// TODO Auto-generated method stub

	}

}
