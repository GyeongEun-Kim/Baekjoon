
import java.util.Scanner;
public class No2675_���ڿ��ݺ� {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int testcase=scanner.nextInt();
		
		
		for (int i=0;i<testcase;i++) {
			int mul=scanner.nextInt();
			String s=scanner.next();
			String n=""; //�� ��Ʈ�� �ϳ� ����
			for (int j=0;j<s.length();j++) {
				for (int k=0;k<mul;k++)
					n+=s.charAt(j);
			}
			System.out.println(n);
		}
		// TODO Auto-generated method stub

	}

}
