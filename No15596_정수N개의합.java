
import java.util.Scanner;

class Test {
	
	static long sum (int a[]) {
		long result=0;
		for (int i=0;i<a.length;i++)
			result+=a[i];
		return result;
	}
	
	
}
public class No15596_정수N개의합 {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
	
		int a[]=new int[num];
		for (int i=0;i<num;i++) {
		a[i]=scanner.nextInt();
		}
		
		System.out.println(Test.sum(a));
		// TODO Auto-generated method stub

	}

}
