
import java.util.Scanner;
public class No11720_숫자의합 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String arr=scanner.next();
		int bread[]=new int[num];
		String one="0";
		char two=one.charAt(0);
		
		int result=0;
		for (int i=0;i<num;i++) {
			bread[i]=(int)arr.charAt(i)-(int)two;
			result+=bread[i];
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
